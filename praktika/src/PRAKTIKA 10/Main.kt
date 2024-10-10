fun main() {
    println("Введите длинну массива")
    var n = readln().toInt()
    println(fill(n).joinToString())
}
fun fill(n:Int):IntArray{
    var arr = IntArray(0)
    if(n == 0){
        return arr
    }
    else {
        for (bss in 1..n) {
            arr += bss
        }
        arr.reverse()
        return arr
    }
}