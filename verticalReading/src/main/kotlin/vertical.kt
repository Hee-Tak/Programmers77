class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        val k = my_string.length / m
        for(i in 0 until k){
            answer += my_string[i*m +(c-1)]
        }
        return answer
    }
}

/**
 * level 0) 세로 읽기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181904
 */