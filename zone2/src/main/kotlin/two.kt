class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var firstIndex: Int = Int.MAX_VALUE
        var secondIndex: Int = Int.MAX_VALUE
        for(i in 0 until arr.size){
            if(arr[i] == 2){
                firstIndex = i
                break
            }
        }

        for(j in arr.size-1 downTo 0){
            if(arr[j] == 2){
                secondIndex = j
                break
            }
        }


        return if(firstIndex == Int.MAX_VALUE){
            intArrayOf(-1)
        } else {
            arr.sliceArray(firstIndex until secondIndex+1)
        }
    }
}

/**
 * level 0) 2의 영역
 * https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */