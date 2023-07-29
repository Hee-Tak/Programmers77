class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(a in arr){
            for(i in 1..a){
                answer += a
            }
        }
        return answer
    }
}

/**
 * level 0) 배열의 원소만큼 추가하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */