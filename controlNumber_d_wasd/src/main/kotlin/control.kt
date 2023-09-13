class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        for(i in 0 until numLog.size-1){
            val d = numLog[i+1] - numLog[i]
            when(d) {
                1 -> answer += "w"
                -1 -> answer += "s"
                10 -> answer += "d"
                -10 -> answer += "a"
            }
        }
        return answer
    }
}

/**
 * level 0) 수 조작하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */