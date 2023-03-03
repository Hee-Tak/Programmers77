class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()

        if(arr.size <= 1){
            return intArrayOf(-1)
        }
        val min = arr.minOrNull()
        val result = arr.filter{it != min}.toIntArray()

        return result
    }
}