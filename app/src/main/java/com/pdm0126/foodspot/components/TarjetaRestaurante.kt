package com.pdm0126.foodspot.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun TarjetaRestaurante(
    restaurant: Restaurant,
    onClick: (Int) -> Unit
) {
    Column(
        modifier = Modifier.padding(16.dp).background(color = Color.White)
            .clickable { onClick(restaurant.id) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(restaurant.imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = restaurant.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(8.dp)
                    .size(120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
        Spacer(modifier = Modifier.height(2.dp))
        Box(modifier = Modifier.padding(bottom = 8.dp)) {
            Text(modifier = Modifier.padding(bottom = 8.dp), text = restaurant.name)
        }
        Spacer(modifier = Modifier.height(2.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Rating",
                tint = Color(0xFFFFB800),
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = restaurant.rating.toString())
            Spacer(modifier = Modifier.width(4.dp))
        }
    }
}

@Preview
@Composable
private fun TarjetaRestaurantePreview() {
    val restaurantTest = Restaurant(
        id = 1,
        name = "Olive Garden",
        description = "Cadena italiana familiar famosa por su pasta ilimitada y pan de ajo",
        imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=800",
        categories = listOf("Italiana", "Pasta"),
        rating = 4.2,
        menu = listOf(
            Dish(
                id = 28,
                name = "Bourbon Street Steak",
                description = "Filete marinado en bourbon con cebollas y pimientos salteados",
                imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?w=800"
            )
        )
    )
    TarjetaRestaurante(restaurantTest, onClick = {})
}