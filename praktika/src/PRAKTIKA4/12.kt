fun main() {
    println("Введите страну:\n" +
            "Россия    Китай   Нигерия  ")
    val blood = readln()

    when(blood){
        "Россия" -> println("пьяные")
        "Китай" -> println("желтые")
        "Нигерия" -> println("уголь")
        else -> println("Это не страна")
    }
}