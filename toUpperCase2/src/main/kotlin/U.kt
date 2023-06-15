class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer: String = ""

        return my_string.replace(alp, alp.toUpperCase())
    }
}

/**
 * level 0) 특정한 문자를 대문자로 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181873
 */