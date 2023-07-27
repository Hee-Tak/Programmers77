class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val box = score.sorted()
        for(i in box.size-1 downTo 0 step m){
            if(i+1 < m) break
            answer += box[maxOf(0,i-m+1)] * m
        }
        return answer
    }
}

/**
 * level 1) 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 *
 * index랑 실제로 쓰는 숫자사이의 괴리때문에 고생함...
 * 이게 무슨말이냐하면
 * index는 0, 1, 2, 3, 4, ... 이렇게 세는것에 반해
 * 실제 갯수셀때는 1, 2, 3, 4, ... 이렇게 가니까 은근 헷갈림
 */