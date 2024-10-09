fun main(){
    println("Введите a")
    var a = readln().toInt()

    println("Введите b")
    var b = readln().toInt()

    println("$a + $b < 100 = " + sum(a,b))
}
fun sum(a:Int,b:Int):Boolean{
    var b = (a + b) < 100
    return b
}