fun main() {

    println("Введите число для сложения цифр")

    var b = readln()


    var g = 0
    var p = 0
    var c = b.toCharArray()

    for(bss in p..b.length-1){
        g += c[p].toString().toInt()
        p++
    }
    println(g)
}
