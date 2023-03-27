class Solution {
    fun solution(s: String): String {
        var answer = ""
        val arr = IntArray(s.length)
        for(i in 0..s.length-1){
            arr[i] = s[i].toInt()
        }
        arr.sortDescending()
        for(i in 0..s.length-1){
            answer += arr[i].toChar()
        }
        return answer
    }
}