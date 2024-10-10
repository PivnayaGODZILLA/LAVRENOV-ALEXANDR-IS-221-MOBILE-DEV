fun main(){
    print("Введите строку ")
    val str = readln()
    println("Было: ${str}\nСтало: ${registr(str)}")
}

var strCased:String = ""

fun registr(str:String):String {
    str.forEach {
        when{
            it.isLowerCase() -> strCased += it.uppercaseChar()
            else -> strCased += it.lowercaseChar()
        }
    }
    return strCased
}