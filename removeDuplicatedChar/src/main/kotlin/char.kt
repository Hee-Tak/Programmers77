class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        val uniqueChars = mutableSetOf<Char>()

        for(char in my_string){
            if(!uniqueChars.contains(char)){
                answer += char
                uniqueChars.add(char)
            }
        }

        return answer
    }
}

/**
 * level 0) 중복된 문자 제거
 * https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */