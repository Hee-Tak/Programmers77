class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        val x: Int = if(a<=b) a else b
        val y: Int = if(x==a) b else a
        for(i in x..y){
            answer += i.toLong()
        }
        return answer
    }
}