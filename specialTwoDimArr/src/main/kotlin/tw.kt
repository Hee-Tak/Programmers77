class Solution {
    fun solution(arr: Array<IntArray>): Int {
        val n = arr.size
        for(i in 0..n-1){
            for(j in 0..n-1){
                if(arr[i][j] != arr[j][i]){
                    return 0
                }
            }
        }
        return 1
    }
}

/**
 * level 0) 특별한 이차원 배열 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181831
 */