class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum: Int = 0
        val size1 = numbers.size
        for(i in 0 until size1){
            sum += numbers[i]
        }
        answer = (sum.toDouble()) / (size1.toDouble())
        return answer
    }
}