class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer += num_list
        if(num_list[num_list.size-1] > num_list[num_list.size-2]){
            answer += num_list[num_list.size-1] - num_list[num_list.size-2]
        } else {
            answer += num_list[num_list.size-1] * 2
        }

        return answer
    }
}

/**
 * level 0) 마지막 두 원소
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */