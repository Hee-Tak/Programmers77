class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for(c in my_string){
            if(c.isUpperCase()){
                answer += c.toLowerCase()
            } else {
                answer += c.toUpperCase()
            }
        }
        return answer
    }
}
/**
 * level 0) 대문자와 소문자
 * https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */