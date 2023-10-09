class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0

        val map = mutableMapOf<Int, Int>()
        for(str in strArr){
            val length = str.length
            map[length] = map.getOrDefault(length, 0) + 1
        }

        val max = map.maxByOrNull { it.value }
        answer = max?.value ?: 0
        return answer
    }
}

/**
 * level 0) 문자열 묶기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181855?language=kotlin
 */