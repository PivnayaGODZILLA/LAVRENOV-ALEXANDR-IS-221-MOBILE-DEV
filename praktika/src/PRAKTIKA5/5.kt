fun main() {

    println("Введите число для проверки его простоты")


    var a = readln().toInt()
    if(balls(a)){
        println("$a простое")
    }
}
fun balls(a: Int): Boolean {
    for(i in 2..a-1 ){
        if(a % i == 0){
            return false
        }
    }
    return true
}