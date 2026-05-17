package com.pdm0126.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.busquedaGeneral.BusquedaGeneralScreen
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
                    backStack.add(Routes.RestauranteDetail(id))},
                    onSearchClick = {backStack.add(Routes.BusquedaGeneral) })
            }
            entry<Routes.RestauranteDetail> { key ->
                RestauranteDetalleScreen(restaurantId = key.id, onBackClick = {
                    backStack.removeLastOrNull()
                })
            }
            entry<Routes.BusquedaGeneral> {
                BusquedaGeneralScreen(
                    onDetail = { id ->
                        backStack.add(Routes.RestauranteDetail(id))
                    },
                    onBackClick = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}