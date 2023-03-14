class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        val c = n.toString()
        for(i in 0..c.length-1){
            //c[i].toInt() => 아스키코드값 나옴

            answer += c[i].toString().toInt()
        }
        return answer
    }
}