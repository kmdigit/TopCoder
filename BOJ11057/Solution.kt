fun main() {
    val N = readLine()!!
    println(solution(N.toInt()))
}

fun solution(N: Int): Int {
    // 1~1000까지의 제약사항에 맞춰 1001개로 생성
    val dp = Array(1001) { IntArray(10) }
    // 1자리수의 경우 갯수는 모두 1
    dp[1].fill(1)

    /**
     * 입력받는 N자리수까지 반복하며 0~9까지의 모든 끝수에 대해 갯수를 구해야 하므로
     * N까지 반복하고 0부터 9까지 반복하도록 2중 반복문을 사용.
     * N자리수의 특정 끝수는 N-1의 0부터 그 끝수까지 갯수의 합이므로
     * 2중 반복문 안에 또 반복문을 추가.
     */
    for (i in 2..N) {
        for (j in 0 until 10) {
            for (k in 0..j) {
                dp[i][j] += dp[i - 1][k]
                dp[i][j] %= 10007
            }
        }
    }
    return dp[N].sum() % 10007
}
