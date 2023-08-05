class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n) { IntArray(n) { 0 } }
        for(i in 0..n-1){
            answer[i][i] = 1
        }
        return answer
    }
}
/**
 * level 0) 특별한 이차원 배열 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181833
 */