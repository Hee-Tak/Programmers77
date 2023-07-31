class Solution {
    fun solution(str1: String, str2: String): Int {
        return if(str2 in str1){
            1
        } else {
            2
        }
    }
}

/**
 * level 0) 문자열안에 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/120908
 * * In 활용
 */