package com.pdm0126.foodspot.dummydata

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

val sampleRestaurants = listOf(

    Restaurant(
        id = 1,
        name = "Olive Garden",
        description = "Cadena italiana familiar famosa por su pasta ilimitada y pan de ajo",
        imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=800",
        categories = listOf("Italiana", "Pasta"),
        rating = 4.2,
        menu = listOf(
            Dish(
                id = 1,
                name = "Fettuccine Alfredo",
                description = "Pasta cremosa con salsa alfredo y queso parmesano rallado",
                imageUrl = "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?w=800"
            ),
            Dish(
                id = 2,
                name = "Lasagna Classica",
                description = "Capas de pasta, carne molida, ricotta y salsa marinara",
                imageUrl = "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?w=800"
            ),
            Dish(
                id = 3,
                name = "Tiramisu",
                description = "Postre italiano con bizcochos, café espresso y mascarpone",
                imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=800"
            )
        )
    ),

    Restaurant(
        id = 2,
        name = "Carrabba's Italian Grill",
        description = "Cocina italiana tradicional con recetas familiares desde 1986",
        imageUrl = "https://images.unsplash.com/photo-1414235077428-338989a2e8c0?w=800",
        categories = listOf("Italiana", "Pizzas"),
        rating = 4.5,
        menu = listOf(
            Dish(
                id = 4,
                name = "Pizza Margherita",
                description = "Base de tomate San Marzano, mozzarella fresca y albahaca",
                imageUrl = "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=800"
            ),
            Dish(
                id = 5,
                name = "Pollo Rosa Maria",
                description = "Pechuga de pollo a la parrilla rellena de prosciutto y fontina",
                imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=800"
            ),
            Dish(
                id = 6,
                name = "Spaghetti e Polpette",
                description = "Espagueti con albóndigas caseras en salsa de tomate",
                imageUrl = "https://images.unsplash.com/photo-1516100882582-96c3a05fe590?w=800"
            )
        )
    ),

    Restaurant(
        id = 3,
        name = "McDonald's",
        description = "La cadena de comida rápida más reconocida del mundo desde 1940",
        imageUrl = "https://images.unsplash.com/photo-1561758033-d89a9ad46330?w=800",
        categories = listOf("Americana", "Comida Rápida"),
        rating = 3.6,
        menu = listOf(
            Dish(
                id = 7,
                name = "Big Mac",
                description = "Doble carne, lechuga, queso, pepinillos y salsa especial",
                imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=800"
            ),
            Dish(
                id = 8,
                name = "McFlurry Oreo",
                description = "Helado suave mezclado con trozos de galleta Oreo",
                imageUrl = "https://images.unsplash.com/photo-1581636625402-29b2a704ef13?w=800"
            ),
            Dish(
                id = 9,
                name = "Papas Fritas",
                description = "Papas doradas crujientes con sal, el acompañamiento clásico",
                imageUrl = "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=800"
            )
        )
    ),

    Restaurant(
        id = 4,
        name = "Burger King",
        description = "Home of the Whopper, famosa por sus hamburguesas a la parrilla",
        imageUrl = "https://images.unsplash.com/photo-1550317138-10000687a72b?w=800",
        categories = listOf("Americana", "Comida Rápida"),
        rating = 3.4,
        menu = listOf(
            Dish(
                id = 10,
                name = "Whopper",
                description = "Carne a la parrilla con lechuga, tomate, mayonesa y cebolla",
                imageUrl = "https://images.unsplash.com/photo-1594212699903-ec8a3eca50f5?w=800"
            ),
            Dish(
                id = 11,
                name = "Chicken Sandwich",
                description = "Pechuga de pollo crujiente con lechuga y mayonesa",
                imageUrl = "https://images.unsplash.com/photo-1606755962773-d324e0a13086?w=800"
            ),
            Dish(
                id = 12,
                name = "Onion Rings",
                description = "Aros de cebolla rebozados y fritos, crujientes por fuera",
                imageUrl = "https://images.unsplash.com/photo-1639024471283-03518883512d?w=800"
            )
        )
    ),

    Restaurant(
        id = 5,
        name = "Nobu",
        description = "Restaurante japonés de lujo del chef Nobu Matsuhisa, con sedes en todo el mundo",
        imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?w=800",
        categories = listOf("Japonesa", "Sushi"),
        rating = 4.8,
        menu = listOf(
            Dish(
                id = 13,
                name = "Black Cod Miso",
                description = "Bacalao negro marinado en miso blanco y sake, plato emblema de Nobu",
                imageUrl = "https://images.unsplash.com/photo-1534482421-64566f976cfa?w=800"
            ),
            Dish(
                id = 14,
                name = "Yellowtail Jalapeño",
                description = "Sashimi de pez limón con rodajas de jalapeño y yuzu soy",
                imageUrl = "https://images.unsplash.com/photo-1617196034183-421b4040ed20?w=800"
            ),
            Dish(
                id = 15,
                name = "Rock Shrimp Tempura",
                description = "Camarones en tempura con salsa cremosa picante",
                imageUrl = "https://images.unsplash.com/photo-1615361200141-f45040f367be?w=800"
            )
        )
    ),

    Restaurant(
        id = 6,
        name = "Benihana",
        description = "Teppanyaki japonés con chefs que cocinan en vivo frente a ti",
        imageUrl = "https://images.unsplash.com/photo-1611143669185-af224c5e3252?w=800",
        categories = listOf("Japonesa", "Hibachi"),
        rating = 4.6,
        menu = listOf(
            Dish(
                id = 16,
                name = "Hibachi Steak",
                description = "Filete de res cocinado al estilo teppanyaki con vegetales salteados",
                imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462?w=800"
            ),
            Dish(
                id = 17,
                name = "Chicken Fried Rice",
                description = "Arroz frito con pollo, huevo y vegetales al estilo japonés",
                imageUrl = "https://images.unsplash.com/photo-1603133872878-684f208fb84b?w=800"
            ),
            Dish(
                id = 18,
                name = "Edamame",
                description = "Vainas de soya al vapor con sal marina, entrada clásica japonesa",
                imageUrl = "https://images.unsplash.com/photo-1540420773420-3366772f4999?w=800"
            )
        )
    ),

    Restaurant(
        id = 7,
        name = "Chipotle",
        description = "Burritos y bowls mexicanos frescos hechos al momento con ingredientes naturales",
        imageUrl = "https://images.unsplash.com/photo-1613514785940-daed07799d9b?w=800",
        categories = listOf("Mexicana", "Comida Rápida"),
        rating = 4.1,
        menu = listOf(
            Dish(
                id = 19,
                name = "Burrito Bowl",
                description = "Arroz, frijoles, pollo asado, pico de gallo y guacamole",
                imageUrl = "https://images.unsplash.com/photo-1512058564366-18510be2db19?w=800"
            ),
            Dish(
                id = 20,
                name = "Tacos de Carnitas",
                description = "Tortillas de maíz con cerdo confitado, cilantro y cebolla",
                imageUrl = "https://images.unsplash.com/photo-1604467794349-0b74285de7e7?w=800"
            ),
            Dish(
                id = 21,
                name = "Quesadilla de Pollo",
                description = "Tortilla de harina con pollo asado y queso Monterey Jack derretido",
                imageUrl = "https://images.unsplash.com/photo-1630645881696-8e00e4c0c8e4?w=800"
            )
        )
    ),

    Restaurant(
        id = 8,
        name = "Taco Bell",
        description = "La cadena de comida mexicana rápida más grande del mundo desde 1962",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=800",
        categories = listOf("Mexicana", "Comida Rápida"),
        rating = 3.3,
        menu = listOf(
            Dish(
                id = 22,
                name = "Crunchwrap Supreme",
                description = "Tortilla doblada con carne, queso nacho, tostada y lechuga",
                imageUrl = "https://images.unsplash.com/photo-1534352956036-cd81e27dd615?w=800"
            ),
            Dish(
                id = 23,
                name = "Nachos Bell Grande",
                description = "Totopos con carne molida, queso líquido, frijoles y crema",
                imageUrl = "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?w=800"
            ),
            Dish(
                id = 24,
                name = "Doritos Locos Taco",
                description = "Taco crujiente con shell de Doritos nacho cheese y carne sazonada",
                imageUrl = "https://images.unsplash.com/photo-1547592180-85f173990554?w=800"
            )
        )
    ),

    Restaurant(
        id = 9,
        name = "Texas Roadhouse",
        description = "Steakhouse americano famoso por sus cortes a mano y rolls de canela",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=800",
        categories = listOf("Americana", "Carnes"),
        rating = 4.4,
        menu = listOf(
            Dish(
                id = 25,
                name = "Ribeye 12oz",
                description = "Corte de costilla a la parrilla con mantequilla de hierbas",
                imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462?w=800"
            ),
            Dish(
                id = 26,
                name = "Fall-Off-The-Bone Ribs",
                description = "Costillas de cerdo ahumadas que se desprenden solas del hueso",
                imageUrl = "https://images.unsplash.com/photo-1529193591184-b1d58069ecdd?w=800"
            ),
            Dish(
                id = 27,
                name = "Rolls de Canela",
                description = "Pan fresco de canela horneado al momento, entrada gratuita icónica",
                imageUrl = "https://images.unsplash.com/photo-1509365465985-25d11c17e812?w=800"
            )
        )
    ),

    Restaurant(
        id = 10,
        name = "Applebee's",
        description = "Bar & Grill americano casual con ambiente familiar y menú variado",
        imageUrl = "https://images.unsplash.com/photo-1466978913421-dad2ebd01d17?w=800",
        categories = listOf("Americana", "Carnes"),
        rating = 3.9,
        menu = listOf(
            Dish(
                id = 28,
                name = "Bourbon Street Steak",
                description = "Filete marinado en bourbon con cebollas y pimientos salteados",
                imageUrl = "https://images.unsplash.com/photo-1600891964092-4316c288032e?w=800"
            ),
            Dish(
                id = 29,
                name = "Mozzarella Sticks",
                description = "Bastones de mozzarella empanizados con marinara para dippear",
                imageUrl = "https://images.unsplash.com/photo-1531749668029-2db88e4276c7?w=800"
            ),
            Dish(
                id = 30,
                name = "Triple Chocolate Meltdown",
                description = "Pastel de chocolate caliente con helado de vainilla y salsa",
                imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=800"
            )
        )
    )
)