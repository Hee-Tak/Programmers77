class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        val lost1: IntArray = lost.filter{it !in reserve}.toIntArray()
        val reserve1: IntArray = reserve.filter{it !in lost}.toIntArray()
        val cal = n-lost1.size+reserve1.size
        answer = when{
            cal >= n -> n
            else -> cal
        }

        return answer
    }
}//나름 획기적인 idea 였으나, "바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있다." 라는 조건을 망각함
//===========================================================================================

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var m = lost.size
        lost.sort()
        reserve.sort()

        for(i in lost.indices)
            for(j in reserve.indices)
                if(lost[i] == reserve[j])
                {
                    m--
                    lost[i] = -5
                    reserve[j] = -5
                    break
                }

        for(i in lost.indices)
        {
            for(j in reserve.indices)
            {
                //if(lost[i]+2 <= reserve[j]) break;
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j])
                {
                    m--
                    reserve[j] = -5
                    break
                }
            }
        }
        answer = n - m

        return answer
    }
}