fun main(){
        var a = arrayOf(5,3,4,10,5)
        var b = arrayOf(6,1,3,2,5)
        println(a.joinToString())
        println(b.joinToString())
        println("\nsum = " + (gad(a,b)).joinToString())
    }
    fun gad(array1: Array<Int>,array2: Array<Int>):Array<Int>{

        var array3 = array1 + array2

        return array3
    }