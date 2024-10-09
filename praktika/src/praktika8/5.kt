fun main(){
    println("Введите prob")
    var a = readln().toInt()

    println("Введите prise")
    var b = readln().toInt()

    println("Введите pay")
    var c = readln().toInt()

    println("prob * prise > pay = "+ buy1(a,b,c))
}
fun buy1(prob:Int,prise:Int,pay:Int):Boolean{
    var b = prob * prise > pay
    return b
}

