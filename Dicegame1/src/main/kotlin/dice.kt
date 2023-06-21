import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val pair = Pair(a,b)
        when{
            (pair.first%2 != 0 && pair.second%2 != 0) -> {
                answer = pair.first*pair.first + pair.second*pair.second
            }
            (pair.first%2 == 0 && pair.second%2 == 0) -> {
                answer = Math.abs(pair.first - pair.second)
            }
            else -> {
                answer = 2*(pair.first+pair.second)
            }
        }
        return answer
    }
}

/**
 * level 0) 주사위 게임1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */