fun main() {


    var i = arrayOf(10,2,3,4,5)
    println("массив = " + i.joinToString())
    println("индекс первого вхождения = "+ las(i))

}

fun las(a:Array<Int>):Int{
    return a.first()
}