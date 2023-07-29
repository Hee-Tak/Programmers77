class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        for(c in 0..code.length-1){
            val index = c % q
            if(index == r){
                answer += code[c]
            }
        }
        return answer
    }
}

/**
 * level 0) qr code
 * https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */