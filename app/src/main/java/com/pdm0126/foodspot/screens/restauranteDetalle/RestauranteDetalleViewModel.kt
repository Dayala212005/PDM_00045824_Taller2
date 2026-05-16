package com.pdm0126.foodspot.screens.restauranteDetalle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.restaurantRepository.IRestaurantRepository
import com.pdm0126.foodspot.data.repositories.restaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestauranteDetalleViewModel: ViewModel() {
    private val restaurantRepository: IRestaurantRepository = RestaurantApiRepository()

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant = _restaurant.asStateFlow()

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading = _loading.asStateFlow()

    fun loadRestaurant(id: Int) {
        viewModelScope.launch {
            _loading.value = true
            _restaurant.value = restaurantRepository.getRestaurantById(id)
            _loading.value = false
        }
    }
    private val _toastMessage = MutableStateFlow<String?>(null)
    val toastMessage = _toastMessage.asStateFlow()

    suspend fun agregarAlCarrito(dishName: String) {
        _toastMessage.value = "$dishName agregado al carrito"
        delay(1000)
        _toastMessage.value = null
    }

}

