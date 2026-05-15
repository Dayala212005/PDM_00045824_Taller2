package com.pdm0126.foodspot.screens.restauranteLista

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.components.AppScaffold
import com.pdm0126.foodspot.components.FilasRestaurantes

@Composable
fun RestauranteListas(
    viewModel: RestauranteListaViewModel = viewModel(),
    onDetail: (Int) -> Unit
) {
    val restaurants by viewModel.restaurants.collectAsState()
    val loading by viewModel.loading.collectAsState()
    var searchQuery by remember { mutableStateOf("") }
    LaunchedEffect(Unit) {
        viewModel.loadRestaurants()
    }
    val filteredRestaurants = restaurants.filter {
        it?.name?.contains(searchQuery, ignoreCase = true) ?: false
    }
    val restaurantsGroup = filteredRestaurants
        .flatMap { restaurant -> restaurant?.categories?.map { category -> category to restaurant }
            ?: emptyList() }
        .groupBy({ it.first }, { it.second })

    if (loading) {
        AppScaffold(title = "Restaurantes") { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }
        return
    }

    AppScaffold(
        title = "Restaurantes",
        searchQuery = searchQuery,
        onSearchQueryChange = { searchQuery = it }
    ) { padding ->
        LazyColumn(contentPadding = padding) {
            restaurantsGroup.forEach { (category, restaurants) ->
                item {
                    FilasRestaurantes(
                        categoryName = category,
                        restaurants = restaurants,
                        onRestaurantClick = { id ->
                            onDetail(id)
                        }
                    )
                }
            }
        }
    }
}
