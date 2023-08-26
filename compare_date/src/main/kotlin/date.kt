class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        for (i in 0..2) {
            if (date1[i] < date2[i]) {
                return 1
            } else if (date1[i] > date2[i]) {
                return 0
            }
        }
        return 0
    }
}

/**
 * level 0) 날짜 비교하기 (3점짜리)
 * https://school.programmers.co.kr/learn/courses/30/lessons/181838#
 *
 * 예외사항이 좀 까다로운듯
 */