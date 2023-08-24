class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        val size = included.size
        for(i in 0 until size){
            if(included[i]){
                answer += a + d * i
            }
        }
        return answer
    }
}

/**
 * level 0) 등차수열의 특정한 항만 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181931
 */