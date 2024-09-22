fun main() {

    println("Введите высоту лестницы")

    var n = readln().toInt()
    bass(n)


}
fun bass(int: Int){
    for(v in 1..int){
        println("#")
    }

}