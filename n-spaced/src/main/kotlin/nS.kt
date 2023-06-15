class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0..num_list.size-1 step n){
            answer += num_list[i]
        }
        return answer
    }
}
/**
 * level 0) n개 간격의 원소들
 * https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */