class Solution {
    fun solution(a: Int, b: Int): Int {
        var temp = ""
        temp += a.toString()
        temp += b.toString()
        val result1 = temp.toInt()
        val result2 = 2*a*b
        return maxOf(result1, result2)
    }
}

/**
 * level 0) 두 수의 연산값 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 *
 *  maxOf 사용해서 좀 더 간단히...
 *  원래는 if문으로 어느쪽이 더 클경우엔 이거 저거 반환하는 그런식으로 하려고했었는데
 */