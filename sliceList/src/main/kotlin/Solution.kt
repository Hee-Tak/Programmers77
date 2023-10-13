class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        when(n){
            1 -> {
                val b = slicer[1]
                for(i in 0..b){
                    answer += num_list[i]
                }
            }
            2 -> {
                val a = slicer[0]
                for(i in a until num_list.size){
                    answer += num_list[i]
                }
            }
            3 -> {
                val a = slicer[0]
                val b = slicer[1]
                for(i in a..b){
                    answer += num_list[i]
                }
            }
            4 -> {
                val a = slicer[0]
                val b = slicer[1]
                val c = slicer[2]
                for(i in a..b step c){
                    answer += num_list[i]
                }
            }
        }
        return answer
    }
}

/**
 * level 0) 리스트 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */