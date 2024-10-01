fun main() {

    println("Введите слово для вычесления палиндрома")
    var a = readln()

    a = a.replace(" ","")
    a = a.lowercase()

    if(a == a.reversed()){

    println("палиндром")

    }
    else{
        println("не палиндром")
    }

}


