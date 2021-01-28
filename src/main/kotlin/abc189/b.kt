package abc189

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val v = MutableList(n) { 0 }
    val p = MutableList(n) { 0 }
    for (i in 0 until n) {
        v[i] = sc.nextInt()
        p[i] = sc.nextInt()
    }

    var s = 0
    for (i in 0 until n) {
        s += v[i] * p[i]
        if (s > x * 100) {
            println(i + 1)
            return
        }
    }

    println(-1)
}