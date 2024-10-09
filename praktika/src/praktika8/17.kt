fun main(){
    println("Введите факториал")
    var n = readln().toInt()

    println(fact(n))
}
fun fact(n:Int):Int{
    var a = 1
    for(bss in 1..n){
        a = a*bss
    }
    return a
}