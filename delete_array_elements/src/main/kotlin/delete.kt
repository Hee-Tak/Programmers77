class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        val random = (1..2).random()
        return if(random == 1){
            sol1(arr, delete_list)
        } else {
            sol2(arr, delete_list)
        }
    }

    fun sol1(arr: IntArray, delete_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(array in arr){
            if(array !in delete_list){
                answer += array
            }
        }
        return answer
    }

    fun sol2(arr: IntArray, delete_list: IntArray): IntArray {
        return arr.filter { it !in delete_list } .toIntArray()
    }
}

/**
 * level 0) 배열의 원소 삭제하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 */