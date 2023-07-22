class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var player: IntArray = intArrayOf(0, 0)
        val max_horizontal: Int = board[0] / 2
        val max_vertical: Int = board[1] / 2
        for(key in keyinput){
            when(key){
                "left" -> {
                    if(player[0] == -(max_horizontal)) continue
                    player[0]--
                }
                "right" -> {
                    if(player[0] == max_horizontal) continue
                    player[0]++
                }
                "up" -> {
                    if(player[1] == max_vertical) continue
                    player[1]++
                }
                "down" -> {
                    if(player[1] == -(max_vertical)) continue
                    player[1]--
                }
            }
        }
        return player
    }
}

/**
 * level 0) 캐릭터의 좌표
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */