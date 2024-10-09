fun main() {
    println("Введите 1 строку")
    var a = readln()

    println("Введите 2 строку")
    var a2 = readln()

    println("объеденение = "+ un(a,a2))
}
fun un(a:String,a2:String):String{
    return a + a2
}