fun main(){
println("Введите число для проверки")
 var n = readln().toDouble()
    println("простота = "+ simple(n))
}
fun simple(n:Double):Boolean{
    var s = true
    var i = 2

    while (i  <= Math.sqrt(n)){
        if(n.toInt() % i == 0){
            s = false
            break
        i++
        }
    }
    return s
}