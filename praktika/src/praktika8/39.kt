fun main() {


    var i = arrayOf(1,2,3,4,5)
    println("массив = " + i.joinToString())
    println("перевернутый = "+ mas(i).joinToString())

}

fun mas(a:Array<Int>):Array<Int>{
    a.reverse()
    return a
}