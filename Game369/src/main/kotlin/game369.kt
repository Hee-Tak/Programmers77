class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        val str = order.toString()
        for(s in str){
            when(s){
                '3', '6', '9' -> {
                    answer++
                }

            }
        }
        return answer
    }
}

/**
 * level 0) 369게임
 * https://school.programmers.co.kr/learn/courses/30/lessons/120891
 */