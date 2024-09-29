fun main() {
    var mas1 = arrayOf(16, 7, 5, 3, 2, 15, 24, 5)
    var mas2 = arrayOf(5, 7, 4, 6, 10, 15,6, 0)
    println("\nПервый массив " + mas1.joinToString())

    println("\nВторой массив " + mas2.joinToString())

    mas1.sort()
    println("\nПервый массив sort " + mas1.joinToString())
    mas2.sort()
    println("\nВторой массив sort " + mas2.joinToString())

    var mas3 = mas1 + mas2
    mas3.sort()
    println("\nСлияние " + mas3.joinToString())
}
