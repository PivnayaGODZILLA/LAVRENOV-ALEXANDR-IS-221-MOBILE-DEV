fun main() {
    var s = readln()
    gls(s)
}
fun gls(s:String){
    var gl = 0
    var sl = 0
    for(bss in 0..s.length-1){
        when(s[bss].toString()){
            "а", "у", "о", "ы", "и", "э", "я", "ю" , "ё", "е" -> gl++
            "б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ" -> sl++
        }
    }
    println("Глассных " + gl)
    println("Согласныеы " + sl)
}