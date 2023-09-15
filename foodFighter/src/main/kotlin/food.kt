class Solution {
    fun solution(food: IntArray): String {
        //food : {물:1 , ... , [i]번째 음식, ... ,[food.size]번째 음식}
        var answer: String = ""

        for(i in 1 until food.size){
            val A: Int = food[i] / 2
            val I: String = i.toString()
            for(j in 1..A){
                answer += I
            }
        }
        val temp = answer.reversed()
        answer += "0"
        answer += temp
        return answer
    }
}

/**
 * level 1) 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */