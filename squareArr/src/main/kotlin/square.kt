class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        //var answer: Array<IntArray> = arrayOf<IntArray>()
        val w = arr[0].size-1
        val h = arr.size-1
        var Flag_WH : Boolean
        if(w == h) return arr
        //val max = if(w > h){
        //    w
        //} else {
        //    h
        //}
        //val min = if(w > h){
        //    h
        //} else {
        //    w
        //}
        var max : Int
        var min : Int
        if(w > h){
            max = w
            min = h
            Flag_WH = true
        } else {
            max = h
            min = w
            Flag_WH = false
        }
        var answer: Array<IntArray> = Array(max+1) { IntArray(max+1) }
        for(i in 0..max){
            for(j in 0..max){
                if(Flag_WH){
                    answer[i][j] = if(i > min){
                        0
                    } else {
                        arr[i][j]
                    }
                } else {
                    answer[i][j] = if(j > min){
                        0
                    } else {
                        arr[i][j]
                    }
                }
            }
        }


        return answer
    }
}

/**
 * level 0) 정사각형으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181830
 */