fun main() {
    var retry:String

    var game = true
    var game1 = true


    var choice = 0
    var c_choice = 0


    var player = 0
    var comp = 0


    var p_score = 0
    var c_score = 0


    var p = { println("\nВаш счет = " + player) }
    var p2 = { println("\nСчет опонента = " + comp + "\n") }

    while(game){

        choice = 0
        game1 = true



        player = (1..21).random()
        comp = (1..21).random()

        p()
        p2()

        if(player == 21 && comp == 21){
            println("ничья")
            game = false
        }

        else if(player == 21){

            p_score += 1
            game1 = false

        }
        else if(comp == 21){

            c_score += 1
            game1 = false

        }
        if(game1 == true){

            while((choice != 1 && choice != 2)){

                println("Напишите что хотите сделать : \n1 = взять карту \n2 = оставить карту\n")
                choice += readln().toInt()

            }

            c_choice = (1..2).random()

            when(choice){
                1 -> player = plus(player)

            }
            when(c_choice){
                1 -> comp = plus(comp)
            }

            p()
            p2()

            if(player > 21 && comp > 21){
                println("Ничья")
            }
            else if(comp > 21 && comp > player){
                println("Вы выйграли со счетом $player")
                p_score += 1
            }
            else if(player > 21 && comp < player){
                println("Опонент выйграл со счетом $comp")
                c_score += 1
            }
            else if(player <= 21 && comp < player){
                println("Вы выйграли со счетом $player")
                p_score += 1
            }
            else if(comp <= 21 && comp > player){
                println("Опонент выйграл со счетом $comp")
                c_score += 1
            }

            println("\nВаши победы : $p_score\n")
            println("Победы опонента : $c_score\n\n")

            game1 = false

            println("Хотите продолжить? \nн - нет \nenter - да ")
            retry = readln()

            if(retry.lowercase() == "н"){
                game = false
            }
        }


    }
    println("\nудачи")
}

fun plus(a:Int):Int{
    return a + (1..10).random()
}