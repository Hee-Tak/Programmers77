class Solution1 {
    fun solution(my_string: String): String {
        // 주어진 문자열에서 모음(a, e, i, o, u)을 제거합니다.
        val result = my_string.filter { it !in "aeiouAEIOU" }

        return result
    }
}

/**
 * level 0) 모음 제거
 * 
 */