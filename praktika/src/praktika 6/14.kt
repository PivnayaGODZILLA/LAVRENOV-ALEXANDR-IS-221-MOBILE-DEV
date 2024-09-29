fun main() {
    val mas = arrayOf(1, 7, 5, 6, 2, 15, 24, 16)

    for (bss in 0..mas.size - 1) {
        if (mas[bss] % 3 == 0) {
            println("${mas[bss]} делиться на 3")
        }
    }
}
