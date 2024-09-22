fun main() {

    println("Введите слово")

    var a = readln().lowercase()
    var b = a.reversed().lowercase()

    if(a.replace(" ","") == b.replace(" ","")){
        println("Палиндром")
    }
    else{
        println("НЕ")
    }

}