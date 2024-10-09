fun main(){
    println("Внесите Кадры в секунду")
    var fps = readln().toInt()
    println("Внесите минуты")
    var min = readln().toInt()
    println("\n${fpm(fps,min)} кадров в минуту")
}
fun fpm(a:Int,b:Int):Int{
    return (a * 60) * b
}