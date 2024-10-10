fun main() {
    var arr = arrayOf("a","c","f","e","d","b","g")
    println(arr.joinToString())
    arr.sort()
    println(arr.joinToString())
}