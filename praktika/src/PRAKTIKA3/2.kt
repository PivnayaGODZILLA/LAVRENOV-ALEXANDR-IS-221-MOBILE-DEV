fun main() {

    println("Введите число A")
    val a = readln().toDouble()

    println("Введите число B")
    val b = readln().toDouble()

    println("Введите число C")
    val c = readln().toDouble()

    if ((b < a  &&  a < c) || ((b > a  &&  a > c))){
        println(a)
    }


    else if ((a < b  &&  b < c) || ((a > b  &&  b > c))){
        println(b)
    }

    else if ((b < c  &&  c < a) || ((b > c  &&  c > a))){
        println(c)
    }

    else if ((a == b) || (a == c) || (b == c)){
        println("ошибка")
    }
}