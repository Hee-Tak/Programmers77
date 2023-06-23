class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        for(i in 1..k){
            answer += my_string
        }
        return answer
    }
}
/**
 * level 0) 문자열 곱하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */