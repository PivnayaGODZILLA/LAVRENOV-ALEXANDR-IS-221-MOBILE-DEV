fun main() {
    var prog = true

    while (prog) {

        println("введите число A")
        val a = readln().toDouble()

        println("введите число B")
        val b = readln().toDouble()

        if ((a >= b)) {

            if (a % b == 0.0) {
                println("${a.toInt()} кратно ${b.toInt()}")


            } else if (a % b != 0.0) {
                println("${a.toInt()} не кратно ${b.toInt()}")
                println("Остаток = ${(a % b).toInt()}")
            }

            prog = false

        } else {
            println("Первое число меньше второго\n")
        }
    }
}