import java.util.*

//method to calculate number of vowels in string
fun calculateVowels(str: String) : Int{
    var count = 0
    for (i in 0 .. (str.length-1)) {
        val ch = str[i]
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()
    str = str.lowercase()
    var numberOfVowels: Int= calculateVowels(str)
    println(numberOfVowels)
}