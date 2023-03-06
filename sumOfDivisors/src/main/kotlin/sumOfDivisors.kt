import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val sqrtN = sqrt(n.toDouble()).toInt()

        for(i in 1..sqrtN){
            if(n%i == 0){
                println(i)
                answer += i

                if(i != n/i){
                    println(n/i)
                    answer += n/i
                }

            }
        }

        return answer
    }
}