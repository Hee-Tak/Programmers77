class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in start..end){
            answer += i
        }
        return answer
    }
}
/**
 * level 0) 카운트 업
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */