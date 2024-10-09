fun main() {
        var a = arrayOf(5,3,4,10,5)
        println(a.joinToString())
        println("MAX = "+prim0(a))
    }
    fun prim0(array: Array<Int>):Int{

        return array.max()
    }
