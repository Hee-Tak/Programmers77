class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()

        val str = myString.split("x")
        for(s in str){
            answer += s.length
        }

        return answer
    }
}
/**
 * level 0) x 사이의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */