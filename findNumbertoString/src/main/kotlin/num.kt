class Solution {
    fun solution(num: Int, k: Int): Int {
        val target = k.toString()[0] // Int를 Char로 변환
        val number = num.toString()
        for (i in 0 until number.length) {
            if (number[i] == target)
                return i+1 // 찾았으면 해당 인덱스를 바로 반환
        }
        return -1 // 찾지 못한 경우 -1 반환
    }
}

/**
 * level 0) 숫자 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120904?language=kotlin
 */