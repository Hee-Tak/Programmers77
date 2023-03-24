class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var num1 = n
        var num2 = n
        while(num1>=a){

            num2 = (num1 / a * b)       //받은 병 갯수
            num1 = (num1 / a * b) + (num1 % a)   // 갖고있는 병에서 계산
            answer += num2
        }
        return answer
    }
}