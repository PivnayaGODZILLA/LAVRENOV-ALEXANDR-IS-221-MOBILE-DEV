fun main() {
    println("Введите число:")
    val a = readLine()!!.toInt()

    val dob = Integer.toBinaryString(a)

    println("В двоичный : $a : $dob")
}