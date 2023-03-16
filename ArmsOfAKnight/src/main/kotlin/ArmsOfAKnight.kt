import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(i in 1..number){
            val sqrtI = sqrt(i.toDouble()).toInt()
            var count = 0
            for(j in 1..sqrtI){
                if(i%j == 0){
                    count++
                }
                if(j != i/j && i % j == 0){
                    count ++
                }
            }
            //print("i : ${i}    ")
            //println(count)
            if(count > limit){
                count = power
            }

            answer += count
        }
        return answer
    }
}