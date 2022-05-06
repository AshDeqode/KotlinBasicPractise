import java.util.*

//method to calculate number of unique characters in string
fun uniqueCharsCount(string : String) : Int {
    var str = string.lowercase()
    val ts: MutableSet<Char> = TreeSet()
    for (i in 0 until str.length) {
        ts.add(str[i])
    }

    return ts.size
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()

    println("Number of unique elements : " + uniqueCharsCount(str))
}