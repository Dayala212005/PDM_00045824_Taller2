package com.pdm0126.foodspot.screens.busquedaGeneral

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.restaurantRepository.IRestaurantRepository
import com.pdm0126.foodspot.data.repositories.restaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class BusquedaGeneralViewModel : ViewModel() {
    private val repository: IRestaurantRepository = RestaurantApiRepository()

    private val _restaurants = MutableStateFlow<List<Restaurant?>>(emptyList())
    val restaurants = _restaurants.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery = _searchQuery.asStateFlow()

    fun loadRestaurants() {
        viewModelScope.launch {
            _restaurants.value = repository.getRestaurants()
        }
    }

    fun onSearchQueryChange(query: String) {
        _searchQuery.value = query
    }
}

