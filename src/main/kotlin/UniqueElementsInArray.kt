import java.util.*

//method to find number of unique elements in array
fun main(args:Array<String>) {
    val list = arrayListOf(1, 2, 3,4,5,3,2,5,6,3,2)
    var ts = TreeSet<Int>()

    for(element in list){
        ts.add(element)
    }

    println(ts.size)
}