class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        if(is_prefix.length > my_string.length) return 0
        for(i in 0..is_prefix.length-1){
            if(my_string[i] != is_prefix[i]){
                return 0
            }
        }
        return 1
    }
}
/**
 * level 0) 접두사인지 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181906
 */

/**
 * 터득한거
 * string 길이는 length
 * 배열의 길이는 size
 */