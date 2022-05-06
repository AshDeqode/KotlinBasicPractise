import java.util.*

//method to calculate the occurance of all characters in string
fun calculateOccurance(str : String) : Map<Char, Int>{
    val hmp: MutableMap<Char, Int> = HashMap()

    for (i in 0 until str.length) {
        val ch = str[i]
        if (hmp.containsKey(ch)) {
            hmp[ch] = hmp[ch]!! + 1
        } else {
            hmp[ch] = 1
        }
    }

    return hmp
}
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()

    println(calculateOccurance(str))
}