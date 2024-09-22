fun main() {

    println("Введите число до которого хотите вывести числа")
    var n = readln().toInt()

    var ch = 0
    var nech = 0

    for(bss in 1..n ){
    if(bss % 2 == 0){
        ch++
    }
        else if(bss % 2 != 0){
            nech++
    }
    }
    println("\nчетные = ${ch}\nнечетные = ${nech}")
}
