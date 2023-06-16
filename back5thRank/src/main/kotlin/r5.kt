class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        num_list.sort()
        for(i in 5..num_list.size-1){
            answer += num_list[i]
        }
        return answer
    }
}
/**
 * level 0) 뒤에서 5등 위로
 * https://school.programmers.co.kr/learn/courses/30/lessons/181852
 */