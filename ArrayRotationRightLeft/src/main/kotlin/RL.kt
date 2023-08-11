class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = intArrayOf()

        when(direction){
            "right" -> {
                answer += numbers[numbers.size-1]
                for(i in 0 until numbers.size-1){
                    answer += numbers[i]
                }
            }

            "left" -> {
                for(i in 1 until numbers.size){
                    answer += numbers[i]
                }
                answer += numbers[0]
            }
        }


        return answer
    }
}

/**
 * level 0) 배열 회전시키기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */