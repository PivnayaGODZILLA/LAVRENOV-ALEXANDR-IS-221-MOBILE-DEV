fun main() {

        val mas = arrayOf(1,"@",5,6,"!",15,24,"?")

        for(bss in 0..mas.size - 1){

            if(mas[bss] == "!" || mas[bss] == "?" || mas[bss] == "@" || mas[bss] == "#" || mas[bss] == ""){
                println("Уникальный символ ${mas[bss]}")

            }
        }
    }