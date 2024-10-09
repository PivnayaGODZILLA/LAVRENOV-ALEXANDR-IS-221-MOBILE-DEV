fun main(){
    println("Введите k")
    var k = readln().toDouble()
    println("Введите n")
    var n = readln().toDouble()

    println("(k^k == n) = " + kk(k,n))
}
fun kk(k:Double,n:Double):Boolean{
    var b =  Math.pow(k,k) == n
    return b
}