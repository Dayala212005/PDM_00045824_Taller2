package com.pdm0126.foodspot.data.repositories.restaurantRepository.dummydata

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

val sampleRestaurants = listOf(

    Restaurant(
        id = 1,
        name = "Bella Italia",
        description = "Restaurante italiano acogedor especializado en pastas artesanales",
        imageUrl = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=1200&q=80",
        categories = listOf("Italiana", "Pasta"),
        rating = 4.7,
        menu = listOf(
            Dish(
                id = 1,
                name = "Fettuccine Alfredo",
                description = "Pasta cremosa con salsa Alfredo y queso parmesano",
                imageUrl = "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?w=1200&q=80"
            ),
            Dish(
                id = 2,
                name = "Lasagna Casera",
                description = "Capas de pasta con carne y queso gratinado",
                imageUrl = "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?w=1200&q=80"
            ),
            Dish(
                id = 3,
                name = "Tiramisu",
                description = "Postre italiano con café y mascarpone",
                imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 2,
        name = "Pizza Roma",
        description = "Pizzería tradicional con horno de piedra",
        imageUrl = "https://images.unsplash.com/photo-1552566626-52f8b828add9?w=1200&q=80",
        categories = listOf("Italiana", "Pizzas"),
        rating = 4.5,
        menu = listOf(
            Dish(
                id = 4,
                name = "Pizza Margherita",
                description = "Pizza clásica con tomate y mozzarella fresca",
                imageUrl = "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=1200&q=80"
            ),
            Dish(
                id = 5,
                name = "Pizza Pepperoni",
                description = "Pizza artesanal con pepperoni y queso",
                imageUrl = "https://images.unsplash.com/photo-1628840042765-356cda07504e?w=1200&q=80"
            ),
            Dish(
                id = 6,
                name = "Espagueti Boloñesa",
                description = "Pasta con salsa de carne y tomate",
                imageUrl = "https://images.unsplash.com/photo-1516100882582-96c3a05fe590?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 3,
        name = "Burger Town",
        description = "Hamburguesas clásicas y comida rápida americana",
        imageUrl = "https://images.unsplash.com/photo-1561758033-d89a9ad46330?w=1200&q=80",
        categories = listOf("Americana", "Comida Rápida"),
        rating = 4.0,
        menu = listOf(
            Dish(
                id = 7,
                name = "Hamburguesa Doble",
                description = "Doble carne con queso y vegetales frescos",
                imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=1200&q=80"
            ),
            Dish(
                id = 8,
                name = "Malteada de Oreo",
                description = "Batido cremoso con galleta Oreo",
                imageUrl = "https://images.unsplash.com/photo-1579954115563-e72bf1381629?w=1200&q=80"
            ),
            Dish(
                id = 9,
                name = "Papas Fritas",
                description = "Papas doradas y crujientes",
                imageUrl = "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 4,
        name = "Grill House",
        description = "Comida rápida con carnes a la parrilla",
        imageUrl = "https://images.unsplash.com/photo-1559339352-11d035aa65de?w=1200&q=80",
        categories = listOf("Americana", "Comida Rápida"),
        rating = 4.1,
        menu = listOf(
            Dish(
                id = 10,
                name = "Hamburguesa BBQ",
                description = "Hamburguesa con salsa BBQ y cebolla caramelizada",
                imageUrl = "https://images.unsplash.com/photo-1594212699903-ec8a3eca50f5?w=1200&q=80"
            ),
            Dish(
                id = 11,
                name = "Chicken Sandwich",
                description = "Sándwich de pollo crujiente",
                imageUrl = "https://images.unsplash.com/photo-1606755962773-d324e0a13086?w=1200&q=80"
            ),
            Dish(
                id = 12,
                name = "Onion Rings",
                description = "Aros de cebolla empanizados",
                imageUrl = "https://images.unsplash.com/photo-1639024471283-03518883512d?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 5,
        name = "Sakura Sushi",
        description = "Restaurante japonés moderno especializado en sushi",
        imageUrl = "https://images.unsplash.com/photo-1514933651103-005eec06c04b?w=1200&q=80",
        categories = listOf("Japonesa", "Sushi"),
        rating = 4.8,
        menu = listOf(
            Dish(
                id = 13,
                name = "Sushi Roll Especial",
                description = "Roll de salmón y aguacate",
                imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?w=1200&q=80"
            ),
            Dish(
                id = 14,
                name = "Sashimi Mixto",
                description = "Selección fresca de pescado",
                imageUrl = "https://images.unsplash.com/photo-1617196034183-421b4040ed20?w=1200&q=80"
            ),
            Dish(
                id = 15,
                name = "Tempura de Camarón",
                description = "Camarones crujientes estilo tempura",
                imageUrl = "https://images.unsplash.com/photo-1615361200141-f45040f367be?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 6,
        name = "Tokyo Grill",
        description = "Experiencia hibachi con cocina japonesa",
        imageUrl = "https://images.unsplash.com/photo-1611143669185-af224c5e3252?w=1200&q=80",
        categories = listOf("Japonesa", "Hibachi"),
        rating = 4.6,
        menu = listOf(
            Dish(
                id = 16,
                name = "Hibachi Steak",
                description = "Filete preparado al estilo japonés",
                imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462?w=1200&q=80"
            ),
            Dish(
                id = 17,
                name = "Arroz Frito con Pollo",
                description = "Arroz salteado con vegetales",
                imageUrl = "https://images.unsplash.com/photo-1603133872878-684f208fb84b?w=1200&q=80"
            ),
            Dish(
                id = 18,
                name = "Edamame",
                description = "Vainas de soya al vapor",
                imageUrl = "https://images.unsplash.com/photo-1540420773420-3366772f4999?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 7,
        name = "Fiesta Mexicana",
        description = "Sabores auténticos mexicanos preparados al momento",
        imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=1200&q=80",
        categories = listOf("Mexicana", "Comida Rápida"),
        rating = 4.4,
        menu = listOf(
            Dish(
                id = 19,
                name = "Burrito Bowl",
                description = "Arroz, pollo y guacamole",
                imageUrl = "https://images.unsplash.com/photo-1512058564366-18510be2db19?w=1200&q=80"
            ),
            Dish(
                id = 20,
                name = "Tacos al Pastor",
                description = "Tacos con carne marinada",
                imageUrl = "https://images.unsplash.com/photo-1604467794349-0b74285de7e7?w=1200&q=80"
            ),
            Dish(
                id = 21,
                name = "Quesadilla",
                description = "Tortilla rellena de queso derretido",
                imageUrl = "https://images.unsplash.com/photo-1630645881696-8e00e4c0c8e4?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 8,
        name = "Taco Express",
        description = "Comida mexicana rápida y deliciosa",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=1200&q=80",
        categories = listOf("Mexicana", "Comida Rápida"),
        rating = 4.0,
        menu = listOf(
            Dish(
                id = 22,
                name = "Crunch Wrap",
                description = "Wrap tostado con carne y queso",
                imageUrl = "https://images.unsplash.com/photo-1534352956036-cd81e27dd615?w=1200&q=80"
            ),
            Dish(
                id = 23,
                name = "Nachos Supremos",
                description = "Nachos con queso y carne",
                imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?w=1200&q=80"
            ),
            Dish(
                id = 24,
                name = "Taco Crujiente",
                description = "Taco de carne con tortilla crocante",
                imageUrl = "https://images.unsplash.com/photo-1547592180-85f173990554?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 9,
        name = "Smoke House",
        description = "Especialistas en carnes y parrilladas",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=1200&q=80",
        categories = listOf("Americana", "Carnes"),
        rating = 4.7,
        menu = listOf(
            Dish(
                id = 25,
                name = "Ribeye Steak",
                description = "Corte premium a la parrilla",
                imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462?w=1200&q=80"
            ),
            Dish(
                id = 26,
                name = "BBQ Ribs",
                description = "Costillas ahumadas con salsa BBQ",
                imageUrl = "https://images.unsplash.com/photo-1529193591184-b1d58069ecdd?w=1200&q=80"
            ),
            Dish(
                id = 27,
                name = "Rollos de Canela",
                description = "Pan dulce recién horneado",
                imageUrl = "https://images.unsplash.com/photo-1509365465985-25d11c17e812?w=1200&q=80"
            )
        )
    ),

    Restaurant(
        id = 10,
        name = "Urban Grill",
        description = "Bar & Grill americano con ambiente moderno",
        imageUrl = "https://images.unsplash.com/photo-1466978913421-dad2ebd01d17?w=1200&q=80",
        categories = listOf("Americana", "Carnes"),
        rating = 4.3,
        menu = listOf(
            Dish(
                id = 28,
                name = "Bourbon Steak",
                description = "Filete marinado estilo bourbon",
                imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?w=1200&q=80"
            ),
            Dish(
                id = 29,
                name = "Mozzarella Sticks",
                description = "Bastones de queso empanizados",
                imageUrl = "https://images.unsplash.com/photo-1531749668029-2db88e4276c7?w=1200&q=80"
            ),
            Dish(
                id = 30,
                name = "Chocolate Lava Cake",
                description = "Pastel caliente de chocolate",
                imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=1200&q=80"
            )
        )
    )
)