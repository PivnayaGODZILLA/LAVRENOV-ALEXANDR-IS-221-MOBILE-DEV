fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if(b == c && a == c){
    println("Равносторонний")
    }
    if(b == c || b == a || a == c){
        println("Равнобедреннй")
    }
    else{
        println("Разносторонний")
    }
}
