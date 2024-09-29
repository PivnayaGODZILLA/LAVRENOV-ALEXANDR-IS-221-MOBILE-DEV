fun main() {
    val mas = arrayOf(1,4,5,6,10,15,24,19)
    var sum = 0
    for(bss in 0..mas.size-1){
        sum += mas[bss]
    }
    print(sum)
}