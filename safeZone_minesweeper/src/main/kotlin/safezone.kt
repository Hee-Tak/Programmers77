//예제1 -> answer: 16
//[[0, 0, 0, 0, 0],
// [0, 0, 0, 0, 0],
// [0, 0, 0, 0, 0],
// [0, 0, 1, 0, 0],
// [0, 0, 0, 0, 0]]

//예제2 -> answer : 13
//[[0, 0, 0, 0, 0],
// [0, 0, 0, 0, 0],
// [0, 0, 0, 0, 0],
// [0, 0, 1, 1, 0],
// [0, 0, 0, 0, 0]]

//예제3 -> answer : 0
//[[1, 1, 1, 1, 1, 1],
// [1, 1, 1, 1, 1, 1],
// [1, 1, 1, 1, 1, 1],
// [1, 1, 1, 1, 1, 1],
// [1, 1, 1, 1, 1, 1],
// [1, 1, 1, 1, 1, 1]]

class Solution {
    fun solution(board: Array<IntArray>): Int {
        val n = board.size
        var check: Array<BooleanArray> = Array(n) { BooleanArray(n) { true } }
        var answer: Int = 0

        //기존 아이디어
        /*for(i in 0 until n){
            for(j in 0 until n){
                if(board[i][j] == 1){
                    if(i >= 1 && i <= n-2 && j >= 1 && j <= n-2){
                        //check[i-1][j-1] = false
                        //check[i-1][j] = false
                        //check[i-1][j+1] = false
                        //check[i][j-1] = false
                        //check[i][j] = false
                        //check[i][j+1] = false
                        //check[i+1][j-1] = false
                        //check[i+1][j] = false
                        //check[i+1][j+1] = false
                        for(r in -1..1){
                            for(c in -1..1){
                                check[i+r][j+c] = false
                            }
                        }
                    }
                }
            }
        }*/

        //check보드 완성
        for(i in 0 until n){
            for(j in 0 until n){
                if(board[i][j] == 1){
                    for(r in -1..1){
                        for(c in -1..1){
                            val Row = i + r
                            val Col = j + c
                            if(Row in 0 until n && Col in 0 until n){
                                check[Row][Col] = false
                            }
                        }
                    }
                }
            }
        }

        //false 갯수 세기 -> 선형 시간에 해결가능한 가장 효율적인 방법
        for(i in 0 until n){
            for(j in 0 until n){
                if(check[i][j] == true){
                    answer++
                }
            }
        }

        return answer
    }
}

/**
 * level 0) 안전지대 (정답률 56%)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120866
 *
 * 중요 아이디어
 * 인접한 요소를 처리할 때 어떻게 중복을 줄일 수 있을까?
 * 예외사항을 고려하여 조건을 맞추는 방법
 */