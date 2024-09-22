fun main() {
    val b = 124.0
    println("число b = " + b)

    println("\nВведите делитель")
    val a = readln().toDouble()

    if(b % a == 0.0){
        println("Число $a является делителем числа B")
    }
    else{
        println("Число $a НЕ является делителем числа B")
    }
}