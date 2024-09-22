fun main() {
    println("Введите число километров:")
    val km = readln().toDouble()

    println("Введите число футов:")
    val ft = readln().toDouble()

    println("Число киллометров " + km)
    println()
    println("Число футов " + ft)
    println()
    println("Переводим футы в километры : ${ft * 0.000305} \n")

    println("Меньшееы число = ${Math.min(km,(ft * 0.000305))}")
}