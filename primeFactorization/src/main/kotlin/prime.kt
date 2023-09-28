class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return primeFactor(n)
    }

    private fun primeFactor(n: Int): IntArray {
        var num = n
        var factors: IntArray = intArrayOf()
        var divisor = 2
        while(num != 1){
            if(num % divisor == 0){
                if(!containsNumber(factors, divisor)){
                    factors += divisor
                }
                num /= divisor
            } else {
                divisor++
            }
        }

        return factors
    }

    private fun containsNumber(arr: IntArray, target: Int): Boolean {
        for(element in arr) {
            if(element == target) {
                return true
            }
        }

        return false
    }
}

/**
 * level 0) 소인수분해
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852
 */