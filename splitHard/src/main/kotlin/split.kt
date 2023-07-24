class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = my_string.split(" ").filter { it.isNotEmpty() }.toTypedArray()
        return answer
    }
}
/**
 * level 0) 공백으로 구분하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */