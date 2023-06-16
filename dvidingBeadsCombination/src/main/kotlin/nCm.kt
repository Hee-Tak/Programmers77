import java.math.BigInteger

class Solution {
    fun solution(balls: Int, share: Int): Int {
        return nCm(balls, share)
    }
    /*
    fun factorial(n: Int): Long{ //Long인거 중요. 근데 이거보다 더 큰거 갖고옴
        //if(n == 0 || n == 1){
        //    return 1
        //}
        //return n * factorial(n-1)
        if(n == 0 || n == 1){
            return 1
        }
        var result: Long = 1
        for(i in 2..n){ //n downTo 1
            result *= i.toLong()
        }
        return result

    }

    fun nCm(n: Int, m: Int): Int{ //combination
        if(m == 0 || m == n){
            return 1
        }
        val numerator = factorial(n)
        val denominator = factorial(n-m) * factorial(m)
        return (numerator / denominator).toInt()
        //return (factorial(n) / (factorial(n-m) * factorial(m))).toInt()
    }
    */
    fun factorial(n: Int): BigInteger {
        if (n == 0 || n == 1) {
            return BigInteger.ONE
        }

        var result = BigInteger.ONE
        for (i in 2..n) {
            result *= BigInteger.valueOf(i.toLong())
        }
        return result
    }

    fun nCm(n: Int, m: Int): Int {
        if (m == 0 || m == n) {
            return 1
        }

        val numerator = factorial(n)
        val denominator = factorial(n - m) * factorial(m)
        return (numerator / denominator).toInt()
    }
}


/**
 * level 0) 구슬을 나누는 경우의 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */