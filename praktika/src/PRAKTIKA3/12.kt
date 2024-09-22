fun main() {
    println("Введите число")
    val a = readln().toDouble()

    if ((a % 10) == (a -(a % 10))/10){
        println("${(a % 10).toInt()} = ${((a -(a % 10))/10).toInt()}")
    }
    else if ((a % 10) < (a -(a % 10))/10) {
        println("${(a % 10).toInt()} < ${((a -(a % 10))/10).toInt()}")
        }
    else if ((a % 10) > (a -(a % 10))/10){
        println("${(a % 10).toInt()} > ${((a -(a % 10))/10).toInt()}")
    }

}