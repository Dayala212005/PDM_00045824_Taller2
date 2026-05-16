package com.pdm0126.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.restauranteDetalle.RestauranteDetalleScreen
import com.pdm0126.foodspot.screens.restauranteLista.RestauranteListas

@Composable
fun FoodSpot() {
    val backStack = rememberNavBackStack(Routes.RestauranteListas)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider{
            entry<Routes.RestauranteListas> {
                RestauranteListas(onDetail = { id ->
                    backStack.add(Routes.RestauranteDetail(id))})
            }
            entry<Routes.RestauranteDetail> { key ->
                RestauranteDetalleScreen(restaurantId = key.id, onBackClick = {
                    backStack.removeLastOrNull()
                })
            }
            entry<Routes.BusquedaGeneral> {

            }
        }
    )
}