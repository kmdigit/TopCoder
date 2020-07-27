fun main() {
    val N = readLine()!!.toInt()
    val dp = Array(N) { IntArray(N) }
    for (i in 0 until N) {
        val numbers = readLine()!!.split(" ")
        numbers.forEachIndexed { index, number -> dp[i][index] = number.toInt() }
    }
    solution(dp)
}

fun solution(dp: Array<IntArray>) {
    var max = 0
    for (i in 1 until dp.size) {
        for (j in 0..i) {
            when (j) {
                0 -> dp[i][j] += dp[i - 1][j]
                i -> dp[i][j] += dp[i - 1][j - 1]
                else -> dp[i][j] += max(dp[i -1][j - 1], dp[i -1][j])
            }
            max = max(max, dp[i][j])
        }
    }
    println("$max")
}
