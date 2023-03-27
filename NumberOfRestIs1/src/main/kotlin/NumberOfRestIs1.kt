class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var min: Int = n-1
        for(i in 1..n){
            if(n%i == 1){
                if(i < min){
                    min = i
                }
            }
        }
        answer = min
        return answer
    }
}