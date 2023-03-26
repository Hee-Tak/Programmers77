import kotlin.math.*

class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var x = if(a<=b) a else b
        var y = if(x==a) b else a
        for(i in 1..log2(n.toDouble()).toInt()){
            x = (x/2.0 + 0.5).toInt()
            y = (y/2.0 + 0.5).toInt()
            if(x==y) {
                answer = i
                break;
            }
            //println("${x} ${y} ${i}라운드  ${log2(n.toDouble()).toInt()}")
        }
        return answer
    }
}