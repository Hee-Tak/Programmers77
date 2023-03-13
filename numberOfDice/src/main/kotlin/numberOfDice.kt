class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 1
        //answer = (box[0]/n) * (box[1]/n) * (box[2]/n)
        for(i in box){
            answer *= i/n
        }
        return answer
    }
}