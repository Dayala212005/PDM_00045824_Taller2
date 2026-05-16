package com.pdm0126.foodspot.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun TarjetaPlato(
    plato: Dish,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier.padding(16.dp).background(color = Color.White),
            horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.padding(bottom = 8.dp).weight(1f)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(plato.imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = plato.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(8.dp)
                    .size(120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
        Column(
            modifier = Modifier.padding(bottom = 8.dp).weight(1f)
        ) {
            Text(text = plato.name, modifier = Modifier.padding(bottom = 8.dp))
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = plato.description, modifier = Modifier.padding(bottom = 8.dp))
            Spacer(modifier = Modifier.height(2.dp))
            Button(
                onClick = onClick,
                modifier = Modifier.padding(bottom = 8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Agregar a Carrito")
            }
        }
    }
}

@Preview
@Composable
fun TarjetaPlatoPreview() {
    val platoTest = Dish(
        id = 23,
        name = "Nachos Bell Grande",
        description = "Totopos con carne molida, queso líquido, frijoles y crema",
        imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?w=800"
    )
    TarjetaPlato(platoTest, onClick = {})
}