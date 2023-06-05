import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val sqrt = sqrt(n.toDouble()).toInt()
        for(i in 1..sqrt){
            if(n % i == 0){
                answer += 2
            }
        }
        if(sqrt*sqrt == n){
            answer--
        }
        return answer
    }
}