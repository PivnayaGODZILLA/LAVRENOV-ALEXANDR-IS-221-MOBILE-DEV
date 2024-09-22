fun main() {
    println("Введите до какого числа хотите увидеть квадрат")
        for(balls in 1..readln().toInt()){
            println("${balls}^2 = ${balls*balls}")
        }
    }
