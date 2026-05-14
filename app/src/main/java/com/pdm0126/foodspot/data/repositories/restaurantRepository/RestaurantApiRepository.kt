package com.pdm0126.foodspot.data.repositories.restaurantRepository

import com.pdm0126.foodspot.dummydata.sampleRestaurants
import com.pdm0126.foodspot.model.Restaurant

class RestaurantApiRepository: IRestaurantRepository {
    override suspend fun getRestaurants(): List<Restaurant> {
        return sampleRestaurants
    }

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurants.find { it.id == id }
    }

    override suspend fun getRestaurantByReference(reference: String): List<Restaurant> {
        if (reference.isBlank()) return emptyList()
        return sampleRestaurants.filter { restaurant ->
            val matchesName = restaurant.name.contains(reference, ignoreCase = true)
            val matchesDish = restaurant.menu.any { dish ->
                dish.name.contains(reference, ignoreCase = true)
            }
            matchesName || matchesDish
        }
    }
}