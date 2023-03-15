class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        for(i in 1..phone_number.length-4){
            answer += "*"
        }
        for(i in 4 downTo 1){
            answer += phone_number[(phone_number.length)-i]
        }
        return answer
    }
}