class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var oddNum: Int = 1
        while(oddNum <= n){
            answer += oddNum
            oddNum += 2
        }
        return answer
    }
}

//========================================
class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 1..n step 2){
            answer += i
        }
        return answer
    }
}

/**
 * level 0) 짝수는 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */