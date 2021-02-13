import java.util.*

fun main() {
    println("hello")
}

fun readInt(): Int = readLine()!!.toInt()
fun readIntList(): List<Int> = readLine()!!.split(" ").map { it.toInt() }
fun readLong(): Long = readLine()!!.toLong()
fun readLongList(): List<Long> = readLine()!!.split(" ").map { it.toLong() }

fun eprintln(obj: Any) = System.err.println(obj.toString())
