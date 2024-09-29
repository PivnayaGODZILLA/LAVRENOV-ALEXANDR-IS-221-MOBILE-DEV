fun main() {
    var mas = IntArray(0)

    var bo = true

    var vvod:String
    println("Вводите массив для вывода, введите стоп что-бы остановиться\n")

    while(bo){

        vvod = readln()

        if(vvod != "стоп"){
            mas += vvod.toInt()
        }

        else{
            println(mas.joinToString())
        }
    }
}