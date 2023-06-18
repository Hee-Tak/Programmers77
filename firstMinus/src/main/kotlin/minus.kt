class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        for(i in num_list.indices){
            if(num_list[i] < 0){
                return i
            }
        }
        return -1
    }
}

/**
 * level 0) 첫 번째로 나오는 음수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181896
 */