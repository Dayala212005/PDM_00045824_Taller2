package com.pdm0126.foodspot.data.repositories.restaurantRepository

import com.pdm0126.foodspot.model.Restaurant

interface IRestaurantRepository {
    suspend fun getRestaurants(): List<Restaurant>

    suspend fun getRestaurantById(id: Int): Restaurant?

    suspend fun getRestaurantByReference(reference: String): List<Restaurant>
}