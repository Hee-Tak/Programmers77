class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        val length = my_string.length-1
        //for(i in length downTo length-n+1){
        //    answer += my_string[i]
        //}
        for(i in length-n+1..length){
            answer += my_string[i]
        }

        return answer
    }
}
/**
 * level 0) 문자열의 뒤의 n글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */