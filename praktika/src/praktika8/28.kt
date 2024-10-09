fun main() {
    println("Выберите размер массива")
    var n = readln().toInt()
    var a = intArrayOf()
    a += gen2(n)
    println("массив = "+a.joinToString())
}
fun gen2(n:Int):IntArray{
    var a = intArrayOf()
    for(bss in 1..n){
        a+=bss
    }
    return a
}