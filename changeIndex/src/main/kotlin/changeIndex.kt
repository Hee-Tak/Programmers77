class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        for(i in 0 until my_string.length){
            if(i == num1){
                answer += my_string[num2].toString()
            } else if(i == num2){
                answer += my_string[num1].toString()
            } else {
                answer += my_string[i].toString()
            }
        }
        return answer
    }
}

/**
 * level 0) 인덱스 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */