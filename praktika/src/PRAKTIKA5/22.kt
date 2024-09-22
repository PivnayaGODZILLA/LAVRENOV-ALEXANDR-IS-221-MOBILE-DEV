fun main() {
    var rnd = (1..100).random()
    var game = true

    println("Угадайте число! [1 - 100]")


    while(game){
        var a = readln().toInt()


        if(a == rnd){
            println("Вы угадали!!!")
            game = false
        }
        if(a == 101){
            println("Удачи!!!")
            game = false
        }
        else if(a != rnd) {
            println("Неверно")
        }
    }
}