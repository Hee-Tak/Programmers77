class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0

        val rows = board.size
        val cols = board[0].size

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(i+j <= k){
                    answer += board[i][j]
                }
            }
        }

        return answer
    }
}

/**
 * level 0) 이차원 배열 대각선 순회하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181829?language=kotlin
 */