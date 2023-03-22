class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var w: Int = 0
        var h: Int = 0
        for(i in sizes.indices){
            if(sizes[i][0] > sizes[i][1]){
                val temp = sizes[i][0]
                sizes[i][0] = sizes[i][1]
                sizes[i][1] = temp
            }
            if(sizes[i][0] > w) w = sizes[i][0]
            if(sizes[i][1] > h) h = sizes[i][1]
        }
        answer = w * h
        return answer
    }
}