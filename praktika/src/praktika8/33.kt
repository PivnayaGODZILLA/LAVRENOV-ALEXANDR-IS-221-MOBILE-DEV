fun main() {
    var arr = arrayOf(0,2,6,3,4,6)
    println("Введите индекс 0 - ${arr.size}")
    println("Ваше число = "+found(arr,readln().toInt()))
}
fun found(array: Array<Int>,int: Int):String{
    return array[int].toString()
}