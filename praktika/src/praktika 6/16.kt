fun main() {
    var massiv1 = arrayOf("a","b","o","b","a")
    var massiv2 = arrayOf("a","b","o","b","a")

    var massiv3 = massiv1+massiv2

    println("Первый массив : ${massiv1.joinToString()}")
    println("Второй массив : ${massiv2.joinToString()}")
    println("Слияние = "+ massiv3.joinToString())
}
