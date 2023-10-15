class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()

        for(i in 0 until arr.size){
            if(arr[i] !in answer){
                answer += arr[i]
            }
            if(answer.size >= k) break
        }

        if(answer.size < k){
            for(i in 0 until k-answer.size){
                answer += -1
            }
        }

        return answer
    }
}

/**
 * level 0) 무작위로 K개의 수 뽑기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181858
 */