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

class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val answer = IntArray(right - left + 1)
        var index = 0
        for (i in left..right) {
            val value = Math.max(i / n, i % n) + 1
            answer[index++] = value
        }
        return answer
    }
}//===========반은 맞고 반은 틀림


class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val left_ = left.toInt()
        val right_ = right.toInt()
        return IntArray(right_-left_+1){ i -> Math.max(((i+left_)/n)1, ((i+left_)%n)+1)}
    }
}//==============얘도 마찬가지


class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val left_ = left.toInt()
        val right_ = right.toInt()
        return IntArray(right_-left_+1){ i -> Math.max(((i+left_)/n)+1, ((i+left_)%n)+1)}
    }
}//==============이거도 안돼?



class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val answer = IntArray((right - left + 1).toInt()) { i ->
            val row = ((i + left) / n).toInt() + 1 // 행
            val col = ((i + left) % n).toInt() + 1 // 열
            maxOf(row, col)
        }
        return answer
    }
}//==== 이거는 정답임
//눈으로 보이는건 형변환을 언제 어디서 붙여주느냐... 그 차이 밖에 안보이는데 그게 클 수 도 있긴하지
// 불필요하게 형변환 많이하는부분에다가 꽂아서 그런가?




