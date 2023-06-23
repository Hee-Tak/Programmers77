// 시간초과 한 방법
class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        for(i in 1..topping.size-2){
            val sliced1 = topping.sliceArray(0 until i).distinct().size
            val sliced2 = topping.sliceArray(i until topping.size).distinct().size
            if(sliced1 == sliced2){
                answer++
            }

        }
        return answer
    }
}



//===== 정답
class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val n = topping.size

        //각 인덱스까지의 토핑 종류 개수 저장
        val leftCounts = IntArray(n)
        val rightCounts = IntArray(n)

        //L->R 토핑 종류 세기
        val leftSet = mutableSetOf<Int>()
        for(i in 0 until n){
            leftSet.add(topping[i])
            leftCounts[i] = leftSet.size
        }

        //R->L 토핑 종류 세기
        val rightSet = mutableSetOf<Int>()
        for(i in n-1 downTo 0){
            rightSet.add(topping[i])
            rightCounts[i] = rightSet.size
        }

        //각 인덱스에서 왼쪽과 오른쪽 조각으로 나누었을 때
        //토핑 종류의 갯수가 동일한지 체크
        for(i in 0 until n -1){
            if(leftCounts[i] == rightCounts[i+1]){
                answer++
            }
        }
        return answer
    }
}


/**
 * level 2) 롤케이크 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/132265
 *
 * 이럴거면 롤케이크 자르기라고 하지말고
 * "롤케이크 토핑 종류의 갯수가 동일하게 자르기" 로 하지
 */

/**
 * 동적 프로그래밍 Dynamic Programming
 *
 * 주어진 문제를 작은 하위 문제로 분할하고, 그 하위 문제들을 풀어서
 * 원래 문제의 해를 구하는 방법론.
 * 작은 하위 문제들의 해를 계산하여 저장해두고, 이를 이용하여 더 큰 규모의 문제를 해결하는 방식
 *
 * 보통 다음과 같은 조건을 만족할 때 사용함
 * 1. 작은 문제들이 반복적으로 발생한다.
 * 2. 작은 문제들의 해를 이용하여 큰 문제의 해를 구할 수 있다.
 * 3. 작은 문제들의 해를 중복 계산하지 않고 저장해 두는 것이 가능하다.
 *
 * 중복 계산을 피하고 작은 문제의 해를 활용하여 원래 문제의 해를 구하는 것이
 * 동적 프로그래밍의 핵심 아이디어.
 */