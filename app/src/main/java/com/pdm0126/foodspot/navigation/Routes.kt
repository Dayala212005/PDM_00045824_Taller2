package com.pdm0126.foodspot.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes: NavKey{
    @Serializable
    data object RestauranteListas: Routes()
    @Serializable
    data class RestauranteDetail(val id: Int): Routes()
    @Serializable
    data object BusquedaGeneral: Routes()
}