fun main() {

    println("Введите строку для отсчета символов")
    var i = readln()
    println("длинна строки = "+ count(i))

    }

fun count(a:String):Int{
    return a.length
}