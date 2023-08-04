class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        val str = binomial.split(" ")
        val a = str[0].toInt()
        val b = str[2].toInt()
        when(str[1]){
            "+" -> {
                answer = a + b
            }
            "-" -> {
                answer = a - b
            }
            "*" -> {
                answer = a * b
            }
        }
        return answer
    }
}

/**
 * level 0) 간단한 식 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181865
 */