class Solution {
    fun solution(letter: String): String {
        //주어진 형태는 python의 Dictionary 형태. key-value 데이터 구조
        val morse = mapOf(
            ".-" to 'a', "-..." to 'b', "-.-." to 'c', "-.." to 'd', "." to 'e',
            "..-." to 'f', "--." to 'g', "...." to 'h', ".." to 'i', ".---" to 'j',
            "-.-" to 'k', ".-.." to 'l', "--" to 'm', "-." to 'n', "---" to 'o',
            ".--." to 'p', "--.-" to 'q', ".-." to 'r', "..." to 's', "-" to 't',
            "..-" to 'u', "...-" to 'v', ".--" to 'w', "-..-" to 'x', "-.--" to 'y',
            "--.." to 'z'
        )
        val letters = letter.split(" ")
        val answer = StringBuilder()
        for(let in letters){
            val decoded = morse[let]
            if(decoded != null){
                answer.append(decoded)
            }
        }

        return answer.toString()

    }
}
/**
 * level 0) 모스부호 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120838
 */