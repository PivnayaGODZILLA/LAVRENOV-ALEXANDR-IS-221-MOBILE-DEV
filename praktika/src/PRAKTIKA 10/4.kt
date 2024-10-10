fun main() {
    println("Введите длинну массива")
    var n = readln().toInt()
    println(fill1(n).joinToString())
}
fun fill1(n:Int):Array<String>{
    var arr = Array<String>(0){""}
    arr.drop(0)
    for (bss in 1..n) {
        if(bss % 5 == 0 && bss % 3 == 0){
            arr += "ФизлллБизллл"
        }
        else if(bss % 3 == 0){
            arr += "Физллл"
        }
        else if(bss % 5 == 0){
            arr += "Бизллл"
        }
        else{
            arr += bss.toString()
        }

    }
    return arr
}