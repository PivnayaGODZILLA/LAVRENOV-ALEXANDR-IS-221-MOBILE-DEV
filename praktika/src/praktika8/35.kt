fun main() {
        println("Введите n")
        var n = readln().toInt()

        println("Сумма чисел от 1 до $n = " + summa(n))
    }
    fun summa1(n:Int):Int{
        var sum = 0
        for(b in 1..n){
            sum += b
        }
        return sum
    }
