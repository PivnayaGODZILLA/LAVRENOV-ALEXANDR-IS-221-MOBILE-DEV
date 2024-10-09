fun main() {
    println("Введите строку")
    var st = readln()
    println(rev(st))
}
fun rev(st:String):String{
    return st.reversed()
}