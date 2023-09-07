class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var x = n
        answer += x
        while(x != 1){
            when(x%2){
                0 -> x /= 2
                1 -> x = 3 * x + 1
            }
            answer += x
        }

        return answer
    }
}

/**
 * level 0) 콜라츠 수열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181919?language=kotlin
 */