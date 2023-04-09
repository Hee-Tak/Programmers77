class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val map = mutableMapOf<Char, Int>()
        for(i in s.indices){
            val c = s[i]
            if(!map.containsKey(c)){
                map[c] = i
                answer += -1
            } else {
                answer += (i - map[c]!!)
                map[c] = i
            }
        }
        return answer
    }
}