class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var e: Int = 0 //even
        var o: Int = 0 //odd
        for(i in num_list){
            if(i % 2 == 0){
                e++
            } else{
                o++
            }
        }
        answer += e
        answer += o
        return answer
    }
}