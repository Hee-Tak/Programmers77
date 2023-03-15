class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        for(c in 0..cipher.length-1){
            if(c%code == code-1){
                answer += cipher[c]
            }
        }
        return answer
    }
}