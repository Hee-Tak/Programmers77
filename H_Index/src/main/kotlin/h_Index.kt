class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        val max = citations.maxOrNull()
        answer = max ?: 0 //null 대응
        citations.sortDescending()

        while(answer >= 0){
            var count = 0
            for(i in citations){
                if(i >= answer) count++
                else break
            }
            if(count >= answer) return answer
            answer--
        }
        return answer
    }
}