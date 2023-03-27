class Solution {
    fun solution(s: String): String {
        val words = s.split(" ")
        val jadenCase = StringBuilder()
        for(word in words){
            if(word.isEmpty()){
                jadenCase.append(" ")
            } else {
                jadenCase.append(word[0].toUpperCase())
                jadenCase.append(word.substring(1).toLowerCase())
                jadenCase.append(" ")
                //val firstChar = word.substring(0, 1).toUpperCase()
                //val restChars = word.substring(1).toLowerCase()
                //jadenCase.append("$firstChar$restChars ")
            }

        }

        if(jadenCase.isNotEmpty()){
            jadenCase.deleteCharAt(jadenCase.length-1)
        }
        return jadenCase.toString()

    }
}