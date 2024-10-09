fun main() {
    var a = arrayOf(5,3,4,10,5)
    println(a.joinToString())
    println("Символ есть в массиве = "+ has(a,2))
}
fun has(array: Array<Int>,int: Int):Boolean{

    return int in array
}
