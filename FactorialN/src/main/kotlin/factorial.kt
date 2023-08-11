class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1

        for(i in 1..Int.MAX_VALUE){
            answer *= i
            if(answer > n){
                return i-1
            }
        }

        return answer
    }
}
/**
 * level 0) 팩토리얼
 * https://school.programmers.co.kr/learn/courses/30/lessons/120848
 */