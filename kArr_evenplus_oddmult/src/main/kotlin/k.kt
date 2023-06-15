class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        val answer = IntArray(arr.size)
        if (k % 2 != 0) {
            for (i in arr.indices) {
                answer[i] = arr[i] * k
            }
        } else {
            for (i in arr.indices) {
                answer[i] = arr[i] + k
            }
        }
        return answer
    }
}

/**
 * level 0) 조건에 맞게 수열 변환하기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181835
 */