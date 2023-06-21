class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        for(str in order){
            if("americano" in str) answer += 4500
            else if("cafelatte" in str) answer += 5000
            else if(str == "anything") answer += 4500
        }
        return answer
    }
}
/**
 * level 0) 커피 심부름
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 *
 *
 * 이제 String 그 안에 포함돼있는지 안돼있는지 in 이용해서 푸는거 깨달아가는중인듯
 *
 * 근데 이런식으로 문제낼거면 ice 니 hot 니 무슨상관이지? 그냥 string 사이에
 * 다른 문자나 문자열들이 끼어있는 상황에서 찾아내길 원한건가
 */