fun main() {
    println("Введите цельсий")
    val c = readln().toInt()
    println("$c градусов цельсия = ${cel_fun(c).toInt()} градусов по феаренгейту")
}
fun cel_fun(c:Int):Double{
    return ((9.0/5.0)*c.toDouble())+32.0
}