class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        if(n%slice == 0){
            answer = n/slice
        } else {
            answer = n/slice + 1
        }
        return answer
    }
}
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */