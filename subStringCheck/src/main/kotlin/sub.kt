class Solution {
    fun solution(my_string: String, target: String): Int {
        return if(target in my_string) 1 else 0
    }
}

/**
 * level 0) 부분 문자열인지 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181843
 * * 마찬가지로 In 활용 문제
 */