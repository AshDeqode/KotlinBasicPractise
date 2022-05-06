import java.util.*

//method to rotate an array by factor of k
fun reverseArray(arr: List<Int?>, high: Int, low: Int): List<Int?> {
    var high = high
    var low = low
    while (low <= high) {
        Collections.swap(arr, high, low)
        low++
        high--
    }
    return arr
}

fun main(args: Array<String>) {
    var arr: List<Int?> = ArrayList(java.util.List.of(1, 2, 3, 4, 5, 6, 7))
    var k = 3
    k %= arr.size
    arr = reverseArray(arr, arr.size - k - 1, 0)
    arr = reverseArray(arr, arr.size - 1, arr.size - k)
    arr = reverseArray(arr, arr.size - 1, 0)
    for (integer in arr) {
            print(integer.toString() + " ,")
    }
}