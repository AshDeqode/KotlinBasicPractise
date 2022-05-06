import java.util.*

//method to return a reversed string
fun reverseString(str: String) : String{
    var newStr = ""
    for (i in str.length - 1 downTo 0) {
        newStr += str[i]
    }
    return newStr
}
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()

    println(reverseString(str))
}