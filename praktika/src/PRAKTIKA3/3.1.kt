fun main() {

    println("Введите число A")
    val a = readln().toDouble()
    println("Введите число B")
    val b = readln().toDouble()

    if((b % 2 == 0.0) && (a % 2 == 0.0)){
        println("ОБА ЧИСЛА ЧЕТНЫЕ!!!")
    }
    else if((b % 2 != 0.0) && (a % 2 != 0.0)) {
        println("ОБА ЧИСЛА НЕЧЕТНЫЕ!!!")
    }
    else if(a % 2 == 0.0){
        println("${a.toInt()} - четное \n" +
                "${b.toInt()} - нечетное ")
    }
    else if(b % 2 == 0.0){
        println("${b.toInt()} - четное \n" +
                "${a.toInt()} - нечетное ")
    }
    }
