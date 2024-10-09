fun main(){
    println("Введите a")
    var a = readln().toInt()

    println("(($a % 100) = 0) = " + sum(a))
}
fun sum(a:Int):Boolean{
    var b = (a % 100) == 0
    return b
}