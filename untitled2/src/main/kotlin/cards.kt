class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var i: Int = 0
        var j: Int = 0
        var k: Int = 0

        while (k < goal.size) {
            when {
                (i < cards1.size && goal[k] == cards1[i]) -> {
                    i++
                    k++
                }
                (j < cards2.size && goal[k] == cards2[j]) -> {
                    j++
                    k++
                }
                else -> {
                    return "No"
                }
            }
        }

        return "Yes"
    }
}

/**
 * level 1) 카드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 * 인덱스가 실제배열범위 밖까지 참조하는 문제때문에 고생함
 */