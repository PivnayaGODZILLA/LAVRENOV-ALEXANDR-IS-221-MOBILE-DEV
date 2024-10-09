fun main(){
    println("Введите число для таблицы\n")
    tab(readln().toInt())
}
fun tab(n:Int){
    for(bss in 1..10){
        println("$n * $bss = ${n*bss}")
    }
}