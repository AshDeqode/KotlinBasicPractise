import java.util.*

//method to remove specific character from string
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    val ch = sc.nextLine()

    val new1 = str.replace(ch, "")
    println(new1)
}