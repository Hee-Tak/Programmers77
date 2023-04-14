class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        /*
        val answer = ArrayList<Int>(n*n)
        for(i in 0 until n){
            for(j in 0 until n){
                //val value = Math.max(i, j) + 1
                answer.add(Math.max(i,j)+1)
            }
        }
        //println(answer)
        return answer.subList(left.toInt(), right.toInt()+1).toIntArray()
        */

        val answer = IntArray((right-left+1).toInt())
        var index = 0
        for(i in left.toInt()..right.toInt()){
            //val row = i / n
            //val col = i % n
            val value = Math.max(i/n, i%n) + 1
            answer[index++] = value
        }
        return answer
    }
}//=====================================위 코드는 아직 미완성 상태.

