class Solution {
    fun solution(arr: IntArray): IntArray {

        if(arr.size <= 1) return intArrayOf(-1)

        var min = arr[0]
        for(i in 1 until arr.size){
            if(arr[i] < min){
                min = arr[i]
            }
        }

        val result = IntArray(arr.size -1)
        var index = 0
        for(i in 0 until arr.size){
            if(arr[i] != min){
                result[index++] = arr[i]
            }
        }

        return result


    }
}