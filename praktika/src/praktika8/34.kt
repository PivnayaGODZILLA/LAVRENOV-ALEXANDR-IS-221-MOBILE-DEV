fun main() {
    println("Введите строки для удаления пробелова")
    println("Строка без пробелов : " + rem(readln()))
}
fun rem(s:String):String{
    return s.replace(" ","")
}