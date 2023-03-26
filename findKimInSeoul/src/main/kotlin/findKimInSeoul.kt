class Solution {
    fun solution(seoul: Array<String>): String {
        var a: Int = 0
        var answer = ""
        for(i in seoul.indices){
            if(seoul[i] == "Kim"){
                a = i
                answer = "김서방은 ${a}에 있다"
                break
            }
        }
        return answer
    }
}