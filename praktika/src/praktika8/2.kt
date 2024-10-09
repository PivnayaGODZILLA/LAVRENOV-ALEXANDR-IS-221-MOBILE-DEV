fun main() {
    var a = arrayOf(5,3,4,10,5)
    println(a.joinToString())
    println(prim2(a))
}
fun prim2(array: Array<Int>):Int{

    return array.max() - array.min()
}
