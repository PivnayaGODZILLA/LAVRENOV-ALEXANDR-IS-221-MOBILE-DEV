fun main() {
        val mas = arrayOf(1,7,5,6,2,15,24,16)
        var sum = 0

        println("\n" + mas.joinToString())

        for(bss in 0..mas.size - 1){
            if(mas[bss] % 2 == 0){
                sum += mas[bss]
            }

        }
        println("\nСумма чётных чисел - ${sum}")


    }
