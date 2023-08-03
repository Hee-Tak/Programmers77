class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = ""
        var str : String = my_string
        for(q in queries){
            val reversedStr = reversedSubstring(str, q[0], q[1])
            str = reversedStr
        }
        answer = str
        return answer
    }

    private fun reversedSubstring(str: String, startIdx: Int, endIdx: Int): String{
        if(startIdx < 0 || endIdx >= str.length || startIdx > endIdx){
            return ""
        }

        val prefix = str.substring(0, startIdx)
        val reversed = str.substring(startIdx, endIdx + 1).reversed()
        val suffix = str.substring(endIdx+1)

        return prefix + reversed + suffix
    }


}

/**
 * level 0) 문자열 여러 번 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181913
 */