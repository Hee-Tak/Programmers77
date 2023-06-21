class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = IntArray(arr.size)
        for(i in arr.indices){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                answer[i] = arr[i] / 2
            } else if(arr[i] < 50 && arr[i] % 2 != 0){
                answer[i] = arr[i] * 2
            } else {
                answer[i] = arr[i]
            }
        }
        return answer
    }
}
/**
 * level 0) 조건에 맞게 수열 변환하기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181882
 *
 */

/**
 * 아무래도 배열의 크기를 미리 지정해준게 속도에 차이가 좀 있는 것 같음
 */