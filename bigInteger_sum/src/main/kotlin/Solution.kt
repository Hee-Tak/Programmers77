import java.math.BigInteger

class Solution {
    fun solution(a: String, b: String): String {
        var answer: String = ""
        val num1 = BigInteger(a)
        val num2 = BigInteger(b)
        answer = num1.add(num2).toString()
        return answer
    }
}

/**
 * level 0) 두 수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 */