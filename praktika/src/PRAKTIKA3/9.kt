fun main() {
    var g = true

while (g) {
    println("Введите число m")
    val m = readln().toDouble()

    println("Введите число n")
    val n = readln().toDouble()


    if (m >= n) {
        if (m % n == 0.0) {
            println("Число ${m.toInt()} нацело делится на число ${n.toInt()}\n")
            g = false
        } else if (m % n != 0.0)
            println(
                "Число ${m.toInt()} нацело НЕ делится на число ${n.toInt()}\n" +
                        "Остаток : ${(m % n).toInt()}\n"
            )
        g = false
    } else {
        println("${m.toInt()} меньше ${n.toInt()}\n")
    }
}
}