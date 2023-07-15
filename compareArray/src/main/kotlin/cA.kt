class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        return if(arr1.size > arr2.size){
            1
        } else if(arr1.size < arr2.size){
            -1
        } else{
            //var sum1: Int = 0
            //var sum2: Int = 0
            //for(s in arr1){
            //    sum1 += s
            //}
            //for(s in arr2){
            //    sum2 += s
            //}
            var sum: Int = 0
            for(s in arr1){
                sum += s
            }
            for(s in arr2){
                sum -= s
            }
            if(sum > 0) 1
            else if(sum < 0) -1
            else 0
        }
    }
}
/**
 * level 0) 배열 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181856
 */