class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        val N = elements.size
        val circularSequence = elements + elements
        val mutableSet: MutableSet<Int> =  mutableSetOf()
        for(start in 0 until N){
            for(end in start until start+N){
                val subList = circularSequence.slice(start until end+1)
                val sum = subList.sum()
                mutableSet.add(sum)
            }
        }
        return mutableSet.size
    }
}


/**
 * level 2) 연속 부분 수열 합의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/131701
 */


/**
 * 핵심 아이디어
 * - 원형 수열을 2배로 늘린다 (수열을 두번 이어 붙인다.)
 * - 원형 수열의 끝과 시작이 이어진 상태로 모든 연속 부분 수열을 탐색
 * - 각 연속 부분 수열의 합 구하기
 */