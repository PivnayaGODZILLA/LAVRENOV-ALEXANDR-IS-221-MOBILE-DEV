fun main() {
            val mas = arrayOf(1,7,5,6,2,15,24,16)
            var g = IntArray(0)
            var c = IntArray(0)

        for(bss in 0..mas.size - 1){
            if(mas[bss] % 2 == 0){
                g += mas[bss]
            }
            else{
                c += mas[bss]
            }
        }


    println("\n${g.joinToString()} - Чётные\n")
    println("\n${c.joinToString()} - Нечётные\n")
    }