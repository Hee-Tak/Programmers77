class Solution {
    fun solution(emergency: IntArray): IntArray {
        val indexedEmergency = emergency.mapIndexed { index, value -> Pair(index, value) }
        val sortedEmergency = indexedEmergency.sortedByDescending { it.second }

        val result = IntArray(emergency.size) { 0 }
        for((rank, pair) in sortedEmergency.withIndex()){
            val (index, _) = pair
            result[index] = rank + 1
        }

        return result
    }
}

/**
 * level 0) 진료 순서 정하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120835?language=kotlin
 *
 * 잠만 이거 벽 좀느껴서
 * 오늘은 머리아프니까 쉬고 내일 이거 연구좀 해야할듯
 */