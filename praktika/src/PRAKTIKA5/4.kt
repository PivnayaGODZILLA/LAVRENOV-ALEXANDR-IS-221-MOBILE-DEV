fun main() {
    var a = readln().toInt()
    var balls = 1
    while (a>1){
    balls *= a
        a--
    }
    print(balls)
}