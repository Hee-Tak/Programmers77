class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        for(i in index_list){
            answer += my_string[i]
        }
        return answer
    }
}

/**
 * level 0) 글자 이어 붙여 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */