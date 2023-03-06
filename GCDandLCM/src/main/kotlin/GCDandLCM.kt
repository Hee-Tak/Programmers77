class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        var a: Int = 0
        var b: Int = 0
        // use Euclidean algorithm
        if(n >= m) {
            a = n
            b = m
        } else{
            a = m
            b = n
        }
        val b_origin = b
        var r = a % b
        while(r != 0){
            val temp = b
            b = r
            r = temp % r
        }
        answer += intArrayOf(b) //최대공약수

        val p: Int = a*b_origin / b
        answer += intArrayOf(p)


        return answer
    }
}