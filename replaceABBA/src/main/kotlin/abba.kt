class Solution {
    fun solution(myString: String, pat: String): Int {
        val str1 = myString.replace("A", "X").replace("B", "A").replace("X", "B")

        return if(pat in str1){
            1
        } else {
            0
        }
    }
}
/**
 * level 0) 문자열 바꿔서 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181864
 */