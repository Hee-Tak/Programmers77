class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        val len: Int = my_strings.size // == parts.size
        for(i in 0..len-1){
            val start = parts[i][0]
            val end = parts[i][1]
            answer += my_strings[i].substring(start, end+1)
        }
        return answer
    }
}

/**
 * level 0) 부분 문자열 이어 붙여 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181911
 */