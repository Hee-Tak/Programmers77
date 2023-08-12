class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = intArrayOf()


        // 수학적으로 생각
        // a + (a+1) + (a+2) + .... + (a + num-1) = total
        // num * a + (num-1 / 2) * (num) = num * a + (num)(num-1) / 2 = total
        // num * ((2a+num-1)/2) = total
        // ((total / num) * 2 + 1 - num)/2 = a

        val a: Int = ((((total.toDouble() / num.toDouble()) * 2) + 1 - num.toDouble()) / 2).toInt()
        for(i in 0..num-1){
            answer += a+i
        }

        return answer
    }
}

/**
 * level 0) 연속된 수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120923
 * 정답률 60%
 */