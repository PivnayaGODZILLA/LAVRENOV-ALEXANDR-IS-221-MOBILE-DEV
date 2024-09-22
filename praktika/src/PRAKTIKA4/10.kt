fun main() {
    println("Введите способ оплаты:\n" +
            "1    2    3")
    val blood = readln()

    when(blood){
        "1" -> println("PAYPAL")
        "2" -> println("НАЛИЧНЫЕ")
        "3" -> println("КРЕДИТНАЯ КАРТА")

        else -> println("ТЫ УМЕР")
    }
}