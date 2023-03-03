enum class Color {
    Красный, Оранжевый, Желтый, Зеленый, Синий, Фиолетовый, Розовый;
}
fun printColor(color: Color): String {
    return when (color) {
        Color.Красный -> "Красный"
        Color.Оранжевый -> "Оранжевый"
        Color.Желтый -> "Желтый"
        Color.Зеленый -> "Зеленый"
        Color.Синий -> "Синий"
        Color.Фиолетовый -> "Фиолетовый"
        Color.Розовый -> "Розовый"
    }
}

fun Coloriesa(color: Color): String{
    return when (color){
        Color.Красный -> "Красный спорт-кар"
        Color.Оранжевый -> "Оранжевый мандарин"
        Color.Желтый -> "Желтое солнце"
        Color.Зеленый -> "Зеленая зелень"
        Color.Синий -> "Синий Океан"
        Color.Фиолетовый -> "Фиолетовая слива"
        Color.Розовый -> "Розовая вата"
    }
}