class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        for(i in array){
            if(i > height){
                answer++
            }
        }
        return answer
    }
}
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */