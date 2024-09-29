fun main() {
    var mas1 = arrayOf(1, 7, 5, 6, 2, 15, 24, 16)
    var mas2 = arrayOf(5, 7, 4, 3, 4, 15, 24, 16)

    println(mas1.joinToString())
    println(mas2.joinToString())

    println("Введите индекс для замены")
    val g = readln().toInt()
    val c = mas1[g]
    mas1[g] = mas2[g]
    mas2[g] = c

    println(mas1.joinToString())
    println(mas2.joinToString())


}