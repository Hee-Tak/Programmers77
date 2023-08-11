class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = -1

        for(i in idx until arr.size){
            if(arr[i] == 1){
                return i
            }
        }

        return answer
    }
}

/**
 * level 0) 가까운 1 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */