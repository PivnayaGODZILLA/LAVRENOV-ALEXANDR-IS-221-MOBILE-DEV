fun main() {

    var n = readln().toInt()
    var mass = IntArray(n)

    for(d in 1..n - 1){
        mass[d] = mass[d-1] + d
    }
    println(mass.joinToString())
}