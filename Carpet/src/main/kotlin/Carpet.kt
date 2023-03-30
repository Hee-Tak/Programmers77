class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        // 2가로+2세로 -4 (모서리 겹침) = brown 갯수(8이상)
        // (가로-2)*(세로-2) = yellow 갯수
        // => 가로*세로 = brown + yellow
        val sum = brown + yellow
        for(i in 1..sum){
            if(sum % i != 0) continue
            val width = sum / i
            val height = i
            if(2*width + 2*height -4 == brown){
                return intArrayOf(width, height)
            }
        }
        return answer
    }
}