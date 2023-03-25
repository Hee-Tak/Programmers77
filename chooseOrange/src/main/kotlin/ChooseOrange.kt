class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        val mode = mutableMapOf<Int, Int>()
        var remainingK = k
        for(i in tangerine){
            //if(mode.containsKey(i)){
            //    mode[i] = mode[i].plus(1) : 1
            //} else{
            //    mode.put(i, 1)
            //}
            mode[i] = mode[i]?.plus(1) ?: 1
        }
        val sortedMod = mode.toList().sortedByDescending{it.second}.toMap()
        for((key, value) in sortedMod){
            remainingK -= value
            answer++
            if(remainingK <= 0) break
        }
        return answer
    }
}