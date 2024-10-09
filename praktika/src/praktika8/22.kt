fun main() {
    println("Введите слово или предложение для проверки на палиндром")
    var i = readln()
    println("палиндром = " + pal(i))
}

fun pal(i:String):Boolean{
    return i.replace(" ","").lowercase() == i.reversed().replace(" ","").lowercase()
}