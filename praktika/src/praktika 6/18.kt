fun main() {
    var massiv = arrayOf(1,2,3,4,5,6,7,8,9,10)

    println("Начальная группа : ${massiv.joinToString()}")

    var ms1 = IntArray(0)
    var ms2 = IntArray(0)
    for(bss in 0..4){
        ms1 += massiv[bss]
    }
    for(bss2 in 5..9){
        ms2 += massiv[bss2]
    }

    println("\nПервая группа : ${ms1.joinToString()}")

    println("\nВторая группа : ${ms2.joinToString()}")
}