//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var a = readln().toInt()
    var i = a
    while (i != 0) {
        a = a - (a % 10)
        i--


    }
    a /= 10

    println( "в числе $a десятков")
}