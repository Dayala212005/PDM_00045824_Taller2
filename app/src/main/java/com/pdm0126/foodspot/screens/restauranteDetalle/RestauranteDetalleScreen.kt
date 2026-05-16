package com.pdm0126.foodspot.screens.restauranteDetalle

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.components.AppScaffold
import com.pdm0126.foodspot.components.TarjetaPlato
import kotlinx.coroutines.launch

@Composable
fun RestauranteDetalleScreen(
    viewModel: RestauranteDetalleViewModel = viewModel(),
    restaurantId: Int,
    onBackClick: () -> Unit
) {
    val restaurant by viewModel.restaurant.collectAsState()
    val loading by viewModel.loading.collectAsState()
    val toastMessage by viewModel.toastMessage.collectAsState()
    val scope = rememberCoroutineScope()

    LaunchedEffect(restaurantId) {
        viewModel.loadRestaurant(restaurantId)
    }

    if (loading) {
        AppScaffold(title = "Cargando...") { padding ->
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
        title = restaurant?.name ?: "Not Found",
        showBackButton = true,
        onBackClick = onBackClick,
        toastMessage = toastMessage
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            item {
                Text(text = restaurant?.description ?: "")
            }
            items(restaurant?.menu?: emptyList()) { dish ->
                TarjetaPlato(dish, onClick = {
                    scope.launch {
                        viewModel.agregarAlCarrito(dish.name)
                    }
                })
            }

        }
    }


}
