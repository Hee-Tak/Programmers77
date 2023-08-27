class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        return numlist.sortedWith(compareBy({ Math.abs(it - n) }, { -it })).toIntArray()
    }
}

//numlist.sortedWith(compareBy({ Math.abs(it - n) }, { -it })

//numlist 배열을 sortedWith 함수를 사용하여 정렬
//sortedWith 함수는 커스텀 비교 로직을 적용하여 배열을 정렬할 수 있게

//compareBy({ Math.abs(it - n) }, { -it })
//{ Math.abs(it - n) }: 첫 번째 기준은 배열의 각 원소 it과 n과의 거리를 계산하여 절대값을 사용하는 것입니다. 이로써 거리가 작은 순서대로 정렬
//{ -it }: 두 번째 기준은 배열의 각 원소를 음수로 변환하여 더 큰 값을 앞으로 배치

/**
 * level 0) 특이한 정렬
 * https://school.programmers.co.kr/learn/courses/30/lessons/120880
 */