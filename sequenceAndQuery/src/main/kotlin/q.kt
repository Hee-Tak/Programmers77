class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for(q in queries){
            var min: Int = Int.MAX_VALUE
            for(i in q[0]..q[1]){
                if(arr[i] > q[2] && arr[i] < min){
                    min = arr[i]
                }
            }
            if(min == Int.MAX_VALUE){
                min = -1
            }
            answer += min
        }
        return answer
    }
}

/**
 * level 0) 수열과 구간 쿼리 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */