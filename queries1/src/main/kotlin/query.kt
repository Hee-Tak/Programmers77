class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        //var answer: IntArray = intArrayOf()
        var answer = arr
        for(query in queries){
            val s = query[0]
            val e = query[1]
            for(i in s..e){
                answer[i]++
            }
        }

        return answer
    }
}

/**
 * level 0) 수열과 구간 쿼리 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */