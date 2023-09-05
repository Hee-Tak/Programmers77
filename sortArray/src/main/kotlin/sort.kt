class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()

        for(str in my_string){
            if(str.isDigit()){
                answer += str.toString().toInt()
            }
        }
        answer.sort()

        return answer
    }
}

/**
 * level 0) 문자열 정렬하기 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */