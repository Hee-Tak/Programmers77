class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        var count: Int = 0
        for(i in arr){
            if(i % divisor == 0){
                count++
                answer += i
            }
        }
        if(count == 0){
            answer += -1
        }
        answer.sort()
        return answer
    }
}