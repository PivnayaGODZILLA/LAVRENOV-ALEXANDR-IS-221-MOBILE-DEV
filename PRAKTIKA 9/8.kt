fun main() {
    var rnd = (1..100).random()
    var game = true
    var choice:Int
    println("Угадай число 1 - 100")
    while(game){
        println("Введите число (0 ЧТОБЫ ЗАКРЫТЬ ПРОГРАММУ!)")
        choice = readln().toInt()
        if(choice == rnd){
            println("Вы выйграли ваше число : $choice")
            break
        }
        else if(choice == 0){
            game = false
        }
        else if(choice<rnd){
            println("Больше!!!")
        }
        else if(choice>rnd){
            println("Меншье!!!")
        }

    }
    println("Конец игры")
}