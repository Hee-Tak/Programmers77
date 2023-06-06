class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var n1 : Int = n
        while(n1 > 0){
            answer += n1 % 10
            n1 /= 10
        }

        return answer

    }
}

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */