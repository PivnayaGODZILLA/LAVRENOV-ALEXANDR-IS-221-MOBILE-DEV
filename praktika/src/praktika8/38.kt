fun main() {

    println("Введите строку для отсчета символов")
    var i = readln()
    println("длинна строки = "+ count1(i))

}

fun count1(a:String):Int{
    return a.length
}