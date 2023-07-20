class Solution {
    fun solution(array: IntArray): Int {

        //각 숫자의 등장 횟수를 세어 Map 으로 만듦
        val frequencyMap = array.groupBy{ it }.mapValues{ it. value.size }

        //최빈값 찾기
        val maxFrequency = frequencyMap.values.maxOrNull()
        val list = frequencyMap.filter{ it.value == maxFrequency }.keys.toList()
        val size = list.size


        return if(size > 1){
            -1
        } else {
            list[0]
        }
    }
}

/**
 * level 0) 최빈값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 */