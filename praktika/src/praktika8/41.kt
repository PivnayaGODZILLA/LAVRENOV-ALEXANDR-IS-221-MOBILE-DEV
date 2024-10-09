fun main() {
    println("Введите строку для поиска глсных")
    println(gl(readln()))
}
fun gl(a:String):Int{
    var c = 0
    for(bss in 0..a.length-1){
    if(a[bss].toString().lowercase() == "а" || a[bss].toString().lowercase() == "о" || a[bss].toString().lowercase() == "у" || a[bss].toString().lowercase() == "э" || a[bss].toString().lowercase() == "и" || a[bss].toString().lowercase() == "ы" || a[bss].toString().lowercase() == "е" || a[bss].toString().lowercase() == "ё" || a[bss].toString().lowercase() == "ю" || a[bss].toString().lowercase() == "я")
        c++
    }
    return c
}