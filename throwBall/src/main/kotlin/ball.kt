class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        var k1 : Int = 0
        var i : Int = 0
        while(true){
            answer = numbers[i]
            i = (i+2) % numbers.size
            k1++

            if(k1 == k){
                break
            }
        }
        return answer
    }
}

/**
 * level 0) 공 던지기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120843
 */