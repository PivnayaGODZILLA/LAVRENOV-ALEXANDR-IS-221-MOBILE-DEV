fun main() {
    println("Введите блюдо для приготовления:\n" +
            "kfc    арбуз   змеевуха")
    val dish = readln()

    when(dish){
        "kfc" -> println("5 минут")
        "арбуз" -> println("0 минут")
        "змеевуха" -> println("10 лет")
        else -> println("Такого блюда нету")
    }
}