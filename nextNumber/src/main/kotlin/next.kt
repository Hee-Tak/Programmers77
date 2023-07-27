class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        if(common[2]-common[1] == common[1] - common[0]){
            //등차수열
            val d = common[2] - common[1]
            return common[common.size-1] + d
        } else{
            //등비수열
            val d = common[2] / common[1]
            return common[common.size-1] * d
        }
        return answer
    }
}
/**
 * level 0) 다음에 올 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/120924
 * 등비수열 등차수열 문제
 */