import java.lang.Integer.max

fun main() {
    var T = readLine()!!.toInt()
    while (T-- > 0) {
        val N = readLine()!!.toInt()
        val first = readLine()!!
        val second = readLine()!!
        println(solution1(N, first, second))
    }
}

fun solution(N: Int, first: String, second: String): Int {
    val sticker = Array(2) { IntArray(N + 1) }
    val score = Array(2) { IntArray(N + 1) }

    first.split(" ").forEachIndexed { index, s -> sticker[0][index + 1] = s.toInt() }
    second.split(" ").forEachIndexed { index, s -> sticker[1][index + 1] = s.toInt() }

    score[0][0] = 0
    score[1][0] = 0
    score[0][1] = sticker[0][1]
    score[1][1] = sticker[1][1]

    for (i in 2..N) {
        score[0][i] = max(score[1][i - 1], score[1][i - 2]) + sticker[0][i]
        score[1][i] = max(score[0][i - 1], score[0][i - 2]) + sticker[1][i]
    }
    return max(score[0][N], score[1][N])
}

fun solution1(N: Int, first: String, second: String): Int {
    val score = Array(2) { IntArray(N + 1) }

    val sticker0 = first.split(" ").map { it.toInt() }
    val sticker1 = second.split(" ").map { it.toInt() }

    score[0][0] = 0
    score[1][0] = 0
    score[0][1] = sticker0[0]
    score[1][1] = sticker1[0]

    for (i in 2..N) {
        score[0][i] = max(score[1][i - 1], score[1][i - 2]) + sticker0[i - 1]
        score[1][i] = max(score[0][i - 1], score[0][i - 2]) + sticker1[i - 1]
    }
    return max(score[0][N], score[1][N])
}
