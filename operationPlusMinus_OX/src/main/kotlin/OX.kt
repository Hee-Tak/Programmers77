class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(q in quiz){
            val words = q.split(" ")
            val a = words[0].toInt()
            val b = words[2].toInt()
            val c = words[1]
            val result = words[4].toInt()
            var sum : Int = 0
            when(c){
                "+" -> {
                    sum = a+b
                }
                "-" -> {
                    sum = a-b
                }
            }
            if(sum == result){
                answer += "O"
            } else {
                answer += "X"
            }
        }
        return answer
    }
}

/**
 * level 0) OX 퀴즈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */