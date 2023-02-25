import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val sqrt = Math.sqrt(n.toDouble()).toLong()
        if(sqrt * sqrt == n){
            answer = (sqrt+1) * (sqrt+1)
        } else {
            return -1
        }
        return answer
    }
}