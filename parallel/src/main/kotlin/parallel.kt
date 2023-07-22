class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0

        //val a: Pair<Int, Int> = Pair(dots[0][0], dots[0][1])
        //val b: Pair<Int, Int> = Pair(dots[1][0], dots[1][1])
        //val c: Pair<Int, Int> = Pair(dots[2][0], dots[2][1])
        //val d: Pair<Int, Int> = Pair(dots[3][0], dots[3][1])
        val (a, b, c, d) = dots.map{ it[0] to it[1] }


        //네 개의 점 중에서, 두 직선을 만드는 방법은
        // ab cd , ac bd , ad bc 로 총 세가지.
        val caseA : Boolean = if(gradient(a, b) == gradient(c, d)){
            true
        } else {
            false
        }
        val caseB : Boolean = if(gradient(a, c) == gradient(b, d)){
            true
        } else {
            false
        }
        val caseC : Boolean = if(gradient(a, d) == gradient(b, c)){
            true
        } else {
            false
        }
        answer = if(caseA || caseB || caseC){
            1
        } else {
            0
        }

        return answer
    }


    private fun gradient(a: Pair<Int,Int>, b: Pair<Int,Int>): Double {
        return (a.second - b.second).toDouble() / (a.first - b.first)
    }
}


/**
 * level 0) 평행
 * https://school.programmers.co.kr/learn/courses/30/lessons/120875
 */