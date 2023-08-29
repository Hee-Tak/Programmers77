class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        for(arr in array){
            val a = arr.toString()
            for(p in a){
                if(p == '7'){
                    answer++
                }
            }
        }
        return answer
    }
}

/**
 * level 0) 7의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120912
 *
 * 이것도 보면 자릿수문제인듯
 */