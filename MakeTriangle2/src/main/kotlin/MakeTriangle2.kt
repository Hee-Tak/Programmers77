class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0

        val sideMax = sides.maxOrNull() ?: return 0
        val sideMin = sides.minOrNull() ?: return 0
        val minus = sideMax - sideMin
        val plus = sideMax + sideMin
        // sides[0] sides[1] answer
        // case1) sideMax < sideMin + answer
        //          sideMax - sideMin < answer < sideMax
        //          minus < answer < sideMax
        // case2) answer < sides[0] + sides[1]
        //          sideMax < answer < sides[0]+sides[1]
        //          sideMax < answer < plus
        // so, minus < answer < plus && answer != sideMax
        for(i in minus..plus-1){
            if(i == sideMax) continue
            answer++
        }


        return answer
    }
}