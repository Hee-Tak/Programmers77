class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var current: Int = 0

        for(c in s.split(" ")){
            if(c == "Z"){
                answer -= current
            } else {
                current = c.toInt()
                answer += current
            }
        }
        return answer
    }
}

/**
 * level 0) 컨트롤 제트
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */