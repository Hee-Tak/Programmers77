class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        for(str in str_list){
            if(ex !in str){
                answer += str
            }
        }
        return answer
    }
}

/**
 * level 0) 꼬리 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181841
 */