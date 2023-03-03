fun main() {
    try {
        println("Введите день недели: ")
        val day = readLine()!!.toString()
        val NameDay = Days.valueOf(day)
        println("${printDay(NameDay)}")
        println("${Info(NameDay)}")
        println("${Weather(NameDay)}")
        println("${News(NameDay)}")
        print("Введи цвет: ")
        val color = readLine()!!.toString()
        val NameColor = Color.valueOf(color)
        println("${printColor(NameColor)}")
        println("${Coloriesa(NameColor)}")
    }catch (e: Exception){
        println("Ошибка ввода")
    }
}