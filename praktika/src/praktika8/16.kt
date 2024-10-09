fun main(){
    println("Введите число")
    var k = readln().toInt()

    println("четность = " + chet(k))
}
fun chet(k:Int):Boolean{
    var b = (k % 2) == 0
    return b
}