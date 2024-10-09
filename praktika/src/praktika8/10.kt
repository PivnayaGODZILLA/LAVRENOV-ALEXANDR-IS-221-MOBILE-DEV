fun main() {
    println("Введите слово")
    var a = readln()
    println("Введите кол-во повторений")
    var n = readln().toInt()

    println(rep(a,n))
}
fun rep(a:String,n:Int):String{
    var c = ""
    for(bss in 1..n){
        c += a
    }
    return c
}
