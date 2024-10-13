package com.example.lazycolumnlazyrow

class Fruits(val name: String, val image: Int, val price: String) {
    companion object{
        val fruitsList = listOf(
            Fruits("Авокадо", R.drawable.avokado, "100р."),
            Fruits("Яблоко", R.drawable.apple, "80р."),
            Fruits("Вишня", R.drawable.cherry, "150р."),
            Fruits("Персик", R.drawable.peach, "200р."),
            Fruits("Лимон", R.drawable.lemon, "170р."),
            Fruits("Апельсин", R.drawable.orange, "190р."),
            Fruits("Манго", R.drawable.mango, "250р."),
            Fruits("Гранат", R.drawable.pomegranate, "200р."),
            Fruits("Клубника", R.drawable.strawberry, "300р."),
            Fruits("Ананас", R.drawable.pineapple, "110р.")
        )
    }
}