class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        var temp: Double = 0.0
        temp = (num1.toDouble())/(num2.toDouble())*1000;
        answer = temp.toInt()
        return answer
    }
}