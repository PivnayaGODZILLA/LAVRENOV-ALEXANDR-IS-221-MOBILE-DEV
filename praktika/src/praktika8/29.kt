fun main() {
    var a = arrayOf(1,2,3,4,5,6)
    println(a.joinToString())
    println()

    nax(a)
}
fun nax(array: Array<Int>){
    println("мин = " + array.min() + "\nмакс = " + array.max())
}