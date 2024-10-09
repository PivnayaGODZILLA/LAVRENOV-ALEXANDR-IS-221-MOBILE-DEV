fun main() {
    var a = arrayOf(5,3,4,10,5)
    println(a.joinToString())
    println("последний элемент "+last(a))
}
fun last(array: Array<Int>):Int{

    return array.last()
}
