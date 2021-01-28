package abc189

import kotlin.math.max
import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { x -> x.toInt() }

    var ans = 0
    for (i in 0 until n) {
        var a_min = a[i]
        for (j in i until n) {
            a_min = min(a_min, a[j])
            ans = max(ans, (j - i + 1) * a_min)
        }
    }

    println(ans)
}