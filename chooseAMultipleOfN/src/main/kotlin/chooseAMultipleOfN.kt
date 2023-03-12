class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = numlist.copyOf()
        for(i in answer){
            if(i % n != 0) {
                answer = answer.filter{it != i}.toIntArray()
            }
        }
        return answer
    }
}


class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        val answerList = arrayListOf<Int>()
        for (i in numlist) {
            if (i % n == 0) {
                answerList.add(i)
            }
        }
        return answerList.toIntArray()
    }
}