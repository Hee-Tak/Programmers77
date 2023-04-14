class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val m = arr1.size
        val k = arr1[0].size //or arr2.size
        val n = arr2[0].size //arr1 : m * k matrix ,  arr2 : k * n matrix

        var answer = Array(m) { IntArray(n) } // 2차원 IntArray 배열 생성

        for (a in 0 until m) {
            for (c in 0 until n) {
                var sum = 0
                for (b in 0 until k) {
                    sum += arr1[a][b] * arr2[b][c]
                }
                answer[a][c] = sum
            }
        }

        return answer
    }
}