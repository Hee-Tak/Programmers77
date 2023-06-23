class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n) { IntArray(n) }
        var i: Int = 0
        var j: Int = 0
        var k: Int = 1
        var flag: Int = 0
        val dx = intArrayOf(0, 1, 0, -1)
        val dy = intArrayOf(1, 0, -1, 0)
        while (k <= n * n) {
            answer[i][j] = k++
            val ni = i + dx[flag]
            val nj = j + dy[flag]
            if (ni < 0 || ni >= n || nj < 0 || nj >= n || answer[ni][nj] != 0) {
                flag = (flag + 1) % 4
            }
            i += dx[flag]
            j += dy[flag]
        }
        return answer
    }
}

/**
 * level 0) 정수를 나선형으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181832
 *
 * 이거 푸는데에 머리 좀 썼는데
 * 이게 1점밖에 안된다니
 */