fun main() {
    val mas1 = arrayOf(1, 7, 5, 6, 2, 15, 24, 16)
    val mas2 = arrayOf(5, 7, 4, 3, 4, 15, 24, 16)

    for (bss in 0..mas1.size - 1) {
        if (mas1[bss] == mas2[bss]) {
            println("Элемент массивов ${mas1[bss]} совпадает в индексе $bss")
        }

    }
}
