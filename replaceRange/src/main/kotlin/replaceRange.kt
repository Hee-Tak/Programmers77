class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        answer = my_string.replaceRange(s, overwrite_string.length+s, overwrite_string)
        return answer
    }
}
/**
 * level 0) 문자열 겹쳐쓰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */