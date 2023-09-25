
class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        val rows = num_list.size / n
        val cols = n
        var count = 0
        val k = (1..2).random()
        when(k){
            1 -> {
                for(i in 0 until rows){
                    var temp = intArrayOf()
                    for(j in 0 until cols){
                        temp += num_list[count++]
                    }
                    answer += temp
                }
            }

            2 -> {
                answer = Array(rows){ IntArray(cols) }
                for(i in 0 until rows){
                    for(j in 0 until cols){
                        answer[i][j] = num_list[count++]
                    }
                }
            }
        }

        return answer
    }
}

/**
 * level 0) 2차원으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120842?language=kotlin
 *
 * k = 1 -> 각행을 채워서 2차원 배열인 answer에 answer += temp 꼴로 넣은것. 즉, += 얘를 활용하려면 answer의 원소 그 자체에 해당하는걸 넣어줘야함
 * k = 2 -> 일반적으로 행,열 미리 계산해서 크기 딱 만들어주고 순서대로 채워나가는 과정
 */