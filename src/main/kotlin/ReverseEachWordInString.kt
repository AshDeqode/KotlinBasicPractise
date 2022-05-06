import java.util.*

//method to reverse each word in string
fun reverseEachWord(str : String) : StringBuffer{
    val newStr = StringBuffer()
    val arr = str.split(" ")

    for (i in arr) {
        val sti = StringBuffer(i)
        newStr.append(sti.reverse().toString() + " ")
    }

    return newStr
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    println(reverseEachWord(str))
}