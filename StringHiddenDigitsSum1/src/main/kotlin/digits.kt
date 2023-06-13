class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for(i in my_string){
            if(i.isDigit()){
                answer += i.toInt()-48
            }
        }
        return answer
    }
}
/**
 * level 0) 숨어있는 숫자의 덧셈 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */