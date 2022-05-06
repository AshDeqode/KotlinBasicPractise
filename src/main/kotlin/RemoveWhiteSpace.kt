import java.util.*

//method to remove all white spaces from string
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()

    str = str.replace(" ", "")
    println(str)
}