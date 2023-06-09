class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0..n-1){
            answer += num_list[i]
        }
        return answer
    }
}

/**
 * level 0) n 번째 원소까지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */