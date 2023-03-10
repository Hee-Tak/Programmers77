class Solution {
    fun solution(s: String): String {
        val num = s.split(" ").map{it.toInt()}
        val min = num.minOrNull() ?: return ""
        val max = num.maxOrNull() ?: return ""
        return "$min $max"
    }
}