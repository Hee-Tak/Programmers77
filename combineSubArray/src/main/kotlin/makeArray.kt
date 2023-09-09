class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for(inter in intervals){
            for(i in inter[0]..inter[1]){
                answer += arr[i]
            }
        }
        return answer
    }
}
/**
 * level 0) 배열 만들기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895?language=kotlin
 */