fun main(){
    var a = readln()
    var c = a.toCharArray()

    println(a + "=" + ar(c))

    }

fun ar(a:CharArray):Int {
    var g = arrayOf("")
    var b = 0
    for (bs in 0..a.size - 1) {
        g += a[bs].toString()
    }
    for (bss in 0..g.size-1) {

            when (g[bss]) {

                "+" -> {

                    g[bss+1] = (g[bss-1].toInt() + g[bss + 1].toInt()).toString()
                    g[bss - 1] = "0"

                }
                "-" -> {

                    g[bss+1] = (g[bss-1].toInt() - g[bss + 1].toInt()).toString()
                    g[bss - 1] = "0"
                }

                "*" -> {

                    g[bss+1] = (g[bss-1].toInt() * g[bss +1].toInt()).toString()
                    g[bss - 1] = "0"

                }

                "/" -> {

                    g[bss+1] = (g[bss-1].toInt() / g[bss + 1].toInt()).toString()
                    g[bss - 1] = "0"
                }

            }



        }

    return g.last().toInt()
}