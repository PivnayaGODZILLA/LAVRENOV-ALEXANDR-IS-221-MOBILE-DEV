fun main() {
    val mas = arrayOf("a","b","c","g","r","h","!","h")

    val g= readln()

    for(bss in 0..mas.size-1){
        if(mas[bss] == g){

            println("Найден элемент ${g} индекс - ${bss}")

        }
    }

}