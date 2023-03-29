class Solution {
    fun solution(number: String, k: Int): String {
        var answer = ""
        val sb = StringBuilder()
        var index = 0
        for (i in 0 until number.length - k) {
            var max = Int.MIN_VALUE
            for (j in index..i + k) {
                if (max < number[j].toInt() - '0'.toInt()) {
                    max = number[j].toInt() - '0'.toInt()
                    index = j + 1
                }
            }
            sb.append(max)
        }
        answer = sb.toString()
        return answer
    }
}