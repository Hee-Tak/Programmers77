class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = Int.MAX_VALUE
        for(a in array){
            if(Math.abs(a - n) <= Math.abs(answer - n)){
                if(Math.abs(a-n) == Math.abs(answer - n)){
                    answer = minOf(a, answer)
                } else {
                    answer = a
                }
            }
        }
        return answer
    }
}

/**
 * level 0) 가까운 수
 * 3점짜리임
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */