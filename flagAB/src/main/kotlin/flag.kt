class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return if(flag){
            a+b
        } else{
            a-b
        }
    }
}
/**
 * level 0) flag에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */