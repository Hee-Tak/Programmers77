class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        if(price >= 500000){
            answer = (price.toDouble() * 0.8).toInt()
        } else if(price >= 300000){
            answer = (price.toDouble() * 0.9).toInt()
        } else if(price >= 100000){
            answer = (price.toDouble() * 0.95).toInt()
        } else{
            answer = price
        }
        return answer
    }
}

/**
 *  문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */