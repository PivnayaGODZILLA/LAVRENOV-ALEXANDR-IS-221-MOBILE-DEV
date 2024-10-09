fun main(){
    google(readln().toInt())
}
fun google(num:Int){
    var google = "Ggle"
    var gog = ""
    for(bss in 1..num){
        google = StringBuilder(google).apply { insert(1, 'o') }.toString()
    }
    println(google)
}