class Solution1 {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(str in intStrs){
            val subStr = str.substring(s, s + l)
            val num = subStr.toInt()
            if(num > k){
                answer += num
            }
        }
        return answer
    }
}

/**
 * level 0) 배열 만들기 5
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */