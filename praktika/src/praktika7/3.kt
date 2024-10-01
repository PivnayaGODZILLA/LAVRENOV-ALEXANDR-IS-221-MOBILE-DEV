fun main() {
    var score = 0
    var scoreb:String
    var game = true

    while(game) {

        println("Введите п - победа, пр - поражение, н - ничья, стоп - остановить отсчет\n")
        scoreb = readln()
        when (scoreb) {

            "н" -> score++
            "п" -> score += 3
            "пр" -> score += 0
            "стоп" -> game = false

        }

    }
    println("Счет = $score")
}
