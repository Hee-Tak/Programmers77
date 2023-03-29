class Solution {
    fun solution(s: String): String {
        var answer = ""
        val t = s.split(" ")
        for (i in t.indices) {
            val word = StringBuilder()
            for (j in t[i].indices) {
                val c = t[i][j]
                word.append(if (j % 2 == 0) c.toUpperCase() else c.toLowerCase())
            }
            answer += word
            if (i != t.size - 1) {
                answer += " "
            }
        }
        return answer
    }
}