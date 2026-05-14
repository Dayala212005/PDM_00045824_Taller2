package com.pdm0126.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay

@Composable
fun FoodSpot() {
    val backStack = rememberNavBackStack(Routes.RestauranteListas)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider{
            entry<Routes.RestauranteListas> {

            }
            entry<Routes.RestauranteDetail> {

            }
            entry<Routes.BusquedaGeneral> {

            }
        }
    )
}