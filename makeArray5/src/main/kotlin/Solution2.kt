class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val temp = s+l-1
        for(i in 0 until intStrs.size){
            val temp1 = intStrs[i].slice(s..temp).toInt()
            if(temp1 > k){
                answer += temp1
            }
        }

        return answer
    }
}

/**
 * level 0) 배열 만들기 5
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */