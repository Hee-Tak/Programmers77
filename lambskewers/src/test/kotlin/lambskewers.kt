class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val n1: Int = n / 10
        answer = n*12000 + (k-n1)*2000
        return answer

    }
}