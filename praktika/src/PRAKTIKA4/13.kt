fun main() {
    println("Введите код ошибки:\n" +
            "300    200   100  ")
    val blood = readln()

    when(blood){
        "300" -> println("ошибка сервера")
        "200" -> println("ошибка пользователя")
        "100" -> println("компьютер взорвался")
        else -> println("Не та ошибка")
    }
}