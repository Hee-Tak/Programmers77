class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in n-1..num_list.size-1){
            answer += num_list[i]
        }
        return answer
    }
}
/**
 * level 0) n번째 원소부터
 * https://school.programmers.co.kr/learn/courses/30/lessons/181892
 */