class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(str in strArr){
            if(!str.contains("ad")){
                answer += str
            }
        }
        return answer
    }
}

/**
 * level 0) ad 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */