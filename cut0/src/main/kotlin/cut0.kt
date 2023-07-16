class Solution {
    fun solution(n_str: String): String {
        var answer: String = ""
        var flag : Boolean = false
        for(n in n_str){
            if(n=='0' && !flag){
                continue
            }
            answer += n
            flag = true
        }
        return answer
    }
}

/**
 * level 0) 0 떼기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181847
 */