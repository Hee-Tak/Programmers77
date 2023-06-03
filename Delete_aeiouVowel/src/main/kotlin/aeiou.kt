class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        val replaced = my_string.replace("a", "")
            .replace("e", "")
            .replace("i", "")
            .replace("o", "")
            .replace("u", "")
        answer = replaced
        return answer
    }
}

//===================================================

class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        val replaced = my_string.replace(Regex("a|e|i|o|u"), "")
        answer = replaced
        return answer
    }
}
//Regex : 정규식 (Regular Expression)