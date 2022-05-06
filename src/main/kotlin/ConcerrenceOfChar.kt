import java.util.*

//method to find concurrence of a character in string
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    val ch = sc.nextLine()
    var count = 0
    for (i in 0..str.length - 1) {
        if (str[i] == ch[0]) {
            count++
        }
    }
    println(count)
}