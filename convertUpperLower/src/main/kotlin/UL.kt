class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in 0..strArr.size-1){
            when(i%2){
                0 -> {
                    answer += strArr[i].toLowerCase()
                }
                1 -> {
                    answer += strArr[i].toUpperCase()
                }
            }
        }
        return answer
    }
}

/**
 * level 0) 배열에서 문자열 대소문자 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181875
 *
 */