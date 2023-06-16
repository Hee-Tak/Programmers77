class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        for(i in numbers){
            answer += i
            if(answer > n){
                break
            }
        }
        return answer
    }
}
/**
 * level 0) n 보다 커질 때까지 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */