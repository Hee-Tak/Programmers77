class Solution {
    fun solution(s: String): Int {
        val wordToNumber = mapOf(
            "zero" to '0',
            "one" to '1',
            "two" to '2',
            "three" to '3',
            "four" to '4',
            "five" to '5',
            "six" to '6',
            "seven" to '7',
            "eight" to '8',
            "nine" to '9'
        )
        var answer = ""
        var i = 0
        while(i < s.length){
            if(s[i].isDigit()){
                answer += s[i]
                i++
            } else {
                for((word, number) in wordToNumber){
                    if(s.startsWith(word, i)){
                        answer += number
                        i += word.length
                        break
                    }
                }
            }
        }
        return answer.toInt()
    }
}