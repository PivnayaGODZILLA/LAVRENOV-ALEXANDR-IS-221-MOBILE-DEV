fun main() {
    println("Введите тип крови:\n" +
            "A    B   AB    O")
    val blood = readln()

    when(blood){
        "A" -> println("Переливай")
        "B" -> println("Не вкусно")
        "AB" -> println("НОРМ")
        "O" -> println("Это кто")
        else -> println("ТЫ УМЕР")
    }
}