fun main() {
    var a = arrayOf(20,3,4,10,5)
    println(a.joinToString())
    println("сортированный = "+SORT(a).joinToString())
}
fun SORT(array: Array<Int>):Array<Int>{
    array.sort()
    return array
}
