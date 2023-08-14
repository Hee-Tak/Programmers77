class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var max = 0
        var index = 0
        for(a in array.indices){
            if(array[a] > max){
                max = array[a]
                index = a
            }
        }
        answer += max
        answer += index
        return answer
    }
}

/**
 * level 0) 가장 큰 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */