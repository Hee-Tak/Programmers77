class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        return if(a != b && a != c && b != c){
            a+b+c
        } else if(a==b && b==c){
            (a+b+c) * (pow(a) + pow(b) + pow(c)) * (triple(a)+triple(b)+triple(c))
        } else {
            (a+b+c) * (pow(a) + pow(b) + pow(c))
        }
    }

    private fun pow(a: Int): Int {
        return a*a
    }

    private fun triple(a: Int): Int {
        return a*a*a
    }
}

/**
 * level 0) 주사위 게임 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */