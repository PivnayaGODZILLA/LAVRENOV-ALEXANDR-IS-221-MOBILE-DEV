import kotlin.math.log

fun main() {
    var a:Double
    var b:Double
    var d = 0.0
    var deist:String

    var c = true

    while(c == true){

        println("Введите число a")
        a = readln().toDouble()

        println("Введите число б")
        b = readln().toDouble()

        deist = readln()

        when(deist){
        "" -> c = false
            "+" -> d = plus(a,b)
            "-" -> d = minus(a,b)
            "*" -> d = umn(a,b)
            "/" -> d = del(a,b)

            "log" ->  println("a = "+ Math.log(a) + "\nb = "+ Math.log(b))
            "arc" -> println("a = "+ Math.asin(a) + "\nb = "+ Math.asin(b))
        }
    println(d.toInt())
    }
}
fun plus(a:Double,b:Double):Double{
    return a + b
}

fun minus(a:Double,b:Double):Double{
    return a - b
}

fun umn(a:Double,b:Double):Double{
    return a * b
}
fun del(a:Double,b:Double):Double{
    return a / b
}