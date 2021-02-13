package yukicoder.c282.a

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val s = List(n) { sc.nextLong() }

    val a = MutableList<Long>(n) { 0 }
    for (i in 0 until n) {
        a[i] = x - s[i]
    }

    val t = a.sum()
    for (i in 0 until n) {
        if (s[i] % 2L == 1L) {
            continue
        }

        val now = t - a[i] + (x - s[i] / 2)
        if (now == x) {
            println(s[i] / 2)
            return
        }
    }
}

fun eprintln(obj: Any) = System.err.println(obj.toString())