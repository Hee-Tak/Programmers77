class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val first = intArrayOf(1, 2, 3, 4, 5)
        val second = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val third = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var (count1 : Int, count2 : Int, count3 : Int) = Triple(0, 0, 0)

        for(i in 0 until answers.size){
            val i1 = i % first.size
            val i2 = i % second.size
            val i3 = i % third.size

            if(answers[i] == first[i1]) count1++
            if(answers[i] == second[i2]) count2++
            if(answers[i] == third[i3]) count3++
        }

        val maxCount = maxOf(count1, count2, count3)
        if(maxCount == count1) answer += 1
        if(maxCount == count2) answer += 2
        if(maxCount == count3) answer += 3

        return answer
    }
}

/**
 * level 1) 모의고사
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 *
 * Triple 클래스, 모듈러
 */