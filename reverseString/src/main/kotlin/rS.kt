import java.util.*

class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        val stack = Stack<Char>()

        for(c in my_string){
            stack.push(c)
        }

        while(stack.isNotEmpty()){
            answer += stack.pop()
        }

        return answer
    }
}

//=====================================
class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for(i in my_string.length -1 downTo 0){
            answer += my_string[i]
        }
        return answer
    }

}

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */