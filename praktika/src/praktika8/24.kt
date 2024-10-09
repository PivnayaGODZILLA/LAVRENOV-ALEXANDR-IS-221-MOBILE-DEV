fun main() {
    println("Введите строку для подъема в верхний регистр")
    var a = readln()
    println("Верхний = "+ up(a))
}
fun up(a:String):String{
    return a.uppercase()
}