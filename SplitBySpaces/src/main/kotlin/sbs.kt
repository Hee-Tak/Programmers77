class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer = my_string.split(" ").toTypedArray()
        return answer
    }
}

/**
 * level 0) 공백으로 구분하기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181869
 */