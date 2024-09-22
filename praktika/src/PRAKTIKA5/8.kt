fun main() {
    println("Введите первое число ")
    val firstNum = readLine()?.toInt()

    println("Введите второе число ")
    val secondNum = readLine()?.toInt()

    if (firstNum != null && secondNum != null) {
        val result = task(firstNum, secondNum)

        println("\nНаибольший общий делитель чисел $firstNum и $secondNum = $result")

    } else {

        println("Некорекктный ввод.")

    }
}
fun task(a: Int, b: Int): Int {
    var x = a ;var y = b
    while (y != 0) {val temp = y; y = x % y; x = temp}
    return x
}
