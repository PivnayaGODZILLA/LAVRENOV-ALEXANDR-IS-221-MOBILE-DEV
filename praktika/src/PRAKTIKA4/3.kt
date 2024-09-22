fun main() {

    println("Оценка по 20-и балльной шкале\n")
    val grade = readln().toInt()
    println()
    when(grade){

        0,1,2,3,4,5,6,7,8,9,10 -> println("плохо")
        11,12,13,14,15,16,17,18,19,20 -> println("круто")
        else -> println("не, фигня")
    }
}