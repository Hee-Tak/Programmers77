
//첫번쨰 방법 (생각해본거)
class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd: Int = 0
        var even: Int = 0
        for(o in 0..num_list.size-1 step 2){
            odd += num_list[o]
        }
        for(e in 1..num_list.size-1 step 2){
            even += num_list[e]
        }
        return if(odd >= even){
            odd
        } else {
            even
        }
    }
}


// 두번째
class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var even: Int = 0
        var odd: Int = 0
        for(i in 0..num_list.size-1){
            when(i%2){
                0 -> {
                    even += num_list[i]
                }
                1 -> {
                    odd += num_list[i]
                }
            }
        }
        if(even >= odd){
            answer = even
        } else {
            answer = odd
        }
        return answer
    }
}

/**
 * level 0) 홀수 vs 짝수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */