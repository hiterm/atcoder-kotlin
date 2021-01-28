package abc189

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val a = s[0]
    val b = s[1]
    val c = s[2]
    val ans = if (a == b && b == c) "Won" else "Lost"
    println(ans)
}