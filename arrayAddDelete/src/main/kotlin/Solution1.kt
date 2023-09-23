class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        val mutableList = mutableListOf<Int>()
        for(i in 0 until arr.size){
            if(flag[i]){
                for(j in 0 until arr[i]*2){
                    mutableList.add(arr[i])
                }
            } else {
                //for(j in 0 until arr[i]){
                //    mutableList.removeAt(mutableList.size-1-j)
                //
                //}//removeAt 대신 슬라이싱으로 자르는게 차라리 좋다
                val removeCount = arr[i]
                if(mutableList.size >= removeCount){
                    mutableList.subList(mutableList.size - removeCount, mutableList.size).clear()
                }
            }
        }
        return mutableList.toIntArray()
    }
}

/**
 * level 0) 빈 배열에 추가, 삭제하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181860
 */