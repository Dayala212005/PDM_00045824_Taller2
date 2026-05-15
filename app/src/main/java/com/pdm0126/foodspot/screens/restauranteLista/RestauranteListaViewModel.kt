package com.pdm0126.foodspot.screens.restauranteLista

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.restaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.restaurantRepository.IRestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestauranteListaViewModel: ViewModel() {
    private val restaurantRepository: IRestaurantRepository = RestaurantApiRepository()

    private val _restaurants = MutableStateFlow<List<Restaurant?>>(emptyList())
    val restaurants = _restaurants.asStateFlow()

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading = _loading.asStateFlow()

    fun loadRestaurants() {
        viewModelScope.launch {
            _loading.value = true
            _restaurants.value = restaurantRepository.getRestaurants()
            _loading.value = false
        }
    }
}

