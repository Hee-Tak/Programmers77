class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        for(c in control){
            when(c){
                'w' -> answer += 1
                's' -> answer -= 1
                'd' -> answer += 10
                'a' -> answer -= 10
            }
        }
        return answer
    }
}
/**
 * level 0) 수 조작하기1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */