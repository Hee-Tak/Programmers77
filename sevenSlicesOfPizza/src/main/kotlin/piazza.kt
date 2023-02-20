class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        while(true){
            if(((answer * 7) / n) >= 1){
                return answer
            } else {
                answer++
            }


        }
        return answer
    }
}