class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        return if(my_string.endsWith(is_suffix)) 1 else 0
    }
}

/**
 * level 0) 접미사인지 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181908
 *
 * endsWith ***
 */