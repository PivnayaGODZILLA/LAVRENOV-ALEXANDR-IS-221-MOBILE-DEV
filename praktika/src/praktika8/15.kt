
    fun main(){
        println("Введиоте a")
        var a = readln().toInt()
        println("Введиоте b")
        var b = readln().toInt()
        println("MAX = " + sum2(a,b))
    }
    fun sum2(a:Int,b:Int):Int{

        return Math.max(a,b)
    }
