class Solution {
    fun solution(numbers: String): Long {
        var answer: String = ""

        val numberMap = mapOf(
            "zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4,
            "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9
        )

        var currentNumber = ""
        for(char in numbers){
            currentNumber += char

            if(currentNumber in numberMap){
                answer += numberMap[currentNumber]
                currentNumber = ""
            }
        }

        return answer.toLong()

    }
}

/**
 * level 0) 영어가 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120894
 *
 * 개인적으론 map 써버리는 아이디어,
 * 글자를 하나씩 다 모아서 모인 글자들이 map에 속하는지 체크되면 숫자로 넘겨버리는거
 * 이게 중요한 아이디어 였던거같음
 */