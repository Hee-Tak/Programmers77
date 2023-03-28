class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0 until numbers.size-1){
            for(j in i+1 until numbers.size){
                val sum = numbers[i]+numbers[j]
                if(!answer.contains(sum)){
                    answer += sum
                }
            }
        }
        answer.sort()
        return answer
    }
}