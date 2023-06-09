class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        when{
            num_list.size >= 11 -> {
                var sum: Int = 0
                for(i in num_list){
                    sum += i
                }
                answer = sum
            }
            else -> {
                var multi: Int = 1
                for(i in num_list){
                    multi *= i
                }
                answer = multi
            }
        }

        return answer
    }
}
/**
 * level 0
 * 길이에 따른 연산
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */