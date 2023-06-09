class Solution {
    fun solution(n_str: String): Int {
        var answer: Int = 0
        var num10: Int = 1
        for(i in n_str.length-1 downTo 0){
            answer += (n_str[i].toInt()-48) * num10
            num10 *= 10
        }
        return answer
    }
}


//========================================================

class Solution {
    fun solution(n_str: String): Int {
        return n_str.toInt()
    }
}


/**
 * level 0) 문자열을 정수로 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181848
 */