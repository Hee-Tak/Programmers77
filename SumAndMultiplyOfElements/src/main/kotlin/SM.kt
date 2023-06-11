class Solution {
    fun solution(num_list: IntArray): Int {
        //var answer: Int = 0
        var a: Int = 1 //모든 원소들의 곱
        var b: Int = 0 //모든 원소들의 합 의 제곱
        for(i in num_list){
            a *= i
            b += i
        }
        b *= b

        return if(a < b){
            1
        } else{
            0
        }
    }
}
/**
 * level 0) 원소들의 곱과 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */