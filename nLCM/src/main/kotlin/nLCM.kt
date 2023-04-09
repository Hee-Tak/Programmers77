class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        arr.sort()
        answer = arr[0]
        for(i in arr){
            answer = LCM(answer, i)
        }
        return answer
    }

    fun LCM(a: Int, b: Int): Int {
        val gcd = GCD(a, b)
        return (a*b) / gcd
    }

    fun GCD(a: Int, b: Int): Int {
        if(b == 0){
            return a
        }
        return GCD(b, a % b)
    } // Use Euclid's algorithm
}