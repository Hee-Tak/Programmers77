class Solution {
    fun solution(my_string: String): Array<String> {
        val suffixes = mutableListOf<String>()

        for (i in 0 until my_string.length) {
            suffixes.add(my_string.substring(i))
        }

        suffixes.sort()

        return suffixes.toTypedArray()
    }
}

/**
 * level 0) 접미사 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909?language=kotlin
 *
 * substring 활용하는 문제였음
 */