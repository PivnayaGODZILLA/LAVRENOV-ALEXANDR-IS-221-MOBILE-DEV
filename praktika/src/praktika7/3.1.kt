fun main() {
    var game = true
    var b:String
    var c = IntArray(0)

    while(game){

        println("Введите число для списка('стоп' для остоновки)")
        var b = readln()

        if(b.lowercase() != "стоп"){
            c += b.toInt()
        }

        else{
            game = false
        }
    }
    println("\nсписок : " + c.joinToString())

    println("\nнаименьшее : " + c.min())
}