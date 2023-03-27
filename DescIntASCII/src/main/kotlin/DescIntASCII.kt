class Solution {
    fun solution(n: Long): Long {
        /*
        var answer: Long = 0
        val s: String = n.toString().toCharArray().sortedByDescending{it}.joinToString("")
        //think about ASCII code
        answer = s.toLong()
        return answer
        */
        return n.toString().toCharArray().sortedByDescending{it}.joinToString("").toLong()
    }
}