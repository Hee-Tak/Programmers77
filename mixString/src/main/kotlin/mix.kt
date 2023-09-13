class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        for(i in 0 until str1.length){
            answer += str1[i]
            answer += str2[i]
        }
        return answer
    }
}

/**
 * level 0) 문자열 섞기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */