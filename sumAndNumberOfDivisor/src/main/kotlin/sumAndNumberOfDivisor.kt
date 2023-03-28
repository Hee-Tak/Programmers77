import kotlin.math.sqrt
class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left..right){
            var count: Int = 0
            for(j in 1..sqrt(i.toDouble()).toInt()){
                if(i % j == 0){
                    count++
                    if(j != i/j){
                        count++
                    }
                }
            }
            if(count % 2 == 0){
                answer += i
            } else{
                answer -= i
            }
        }
        return answer
    }
}