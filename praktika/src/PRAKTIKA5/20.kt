fun main() {

    println("Введите начало")
    var a = readln().toInt()

    println("Введите конец")
    var b = readln().toInt()

    while (a < b) {
        if (balls(a)) {
            println("$a простое")
        }
        a++
    }
}
fun ball(a: Int): Boolean {
    for(i in 2..a-1 ){
        if(a % i == 0){
            return false
        }
    }
    return true
}