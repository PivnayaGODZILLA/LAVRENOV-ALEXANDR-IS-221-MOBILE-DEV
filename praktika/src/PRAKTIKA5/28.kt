fun main() {
    println("Выбирите кол-во чисел для вывода")
    var inf = readln().toInt()

    var g = IntArray(inf)

    println(g.toUIntArray())

    for(bss in 0 .. inf - 1){

        println("\nВведите число в массив")

        g[bss] = readln().toInt()
        println(g.toUIntArray())
    }

    g.sort()

    println("\n\nОтсортированный массив : \n"+g.toUIntArray())

}