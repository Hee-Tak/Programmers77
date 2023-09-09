class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer = LCM(6, n) / 6
        return answer
    }

    private fun LCM(a: Int, b: Int): Int {
        return (a * b) / GCD(a, b)
    }

    private fun GCD(a: Int, b: Int): Int {
        var num1 = a
        var num2 = b
        while(num2 != 0){
            val temp = num2
            num2 = num1 % num2
            num1 = temp
        }
        return num1
    }
}

/**
 * level 0) 피자 나눠 먹기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815?language=kotlin
 */