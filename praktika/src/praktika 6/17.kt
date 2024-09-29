fun main() {
    val mas = arrayOf(1,4,5,6,10)
    var sum = 0
    var umn = 1
    for(bss in 0..mas.size-1){
        sum += mas[bss]
        umn *= mas[bss]
    }
    println("Сложение : " + sum)
    println("Умножение :" +umn)
}