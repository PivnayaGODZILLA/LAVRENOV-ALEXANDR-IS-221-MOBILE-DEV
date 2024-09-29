fun main() {
    var mas = arrayOf(1,7,5,6,2,15,24,16)
    var n = readln().toInt()
    var bool = false
    for(balls in 0..mas.size-1){
        if(n == mas[balls]){
            bool = true
        println("$n "+bool)
        }
        else if(n != balls){
            bool = false
            println("$balls $bool")
        }
    }
}