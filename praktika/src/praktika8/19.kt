fun main(){
    var a = arrayOf(5,3,4,10,5)
    println(a.joinToString())
    println("сумма чисел = "+prim5(a))
}
fun prim5(array: Array<Int>):Int{
    var int = 0
    for( bss in 0..array.size - 1){
        int += array[bss]
    }
    return int
}
