class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        for(n in number){
            answer += n.toString().toInt()
        }
        return answer % 9
    }
}

/**
 * level 0) 9로 나눈 나머지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 *
 * 중요한거 :
 * String 형 데이터를 Int형으로 바로 형변환 하면 거기에 해당하는 정수값이 그대로 나옴 (ex> "1" -> 1)
 * Char 형 데이터를 Int형으로 바로 형변환 하면 해당하는 아스키코드값이 나옴 (ex> '1' -> 49)
 * 그러므로 Char형 데이터를 원하는대로 Int형 데이터 그대로 뽑아내려면 String으로 돌아가는 작업을 한번 거치거나 -48을 해줘야함
 */