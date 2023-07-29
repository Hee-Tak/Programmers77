class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        return CD(numer1, denom1, numer2, denom2)
    }

    public fun gcd(a: Int, b: Int): Int{
        return if(b == 0) a else gcd(b, a % b)
    } //최소공배수

    public fun lcm(a: Int, b: Int): Int{
        return (a*b) / gcd(a, b)
    }//최대공약수

    public fun simplifyFraction(a: Int, b: Int): Pair<Int, Int> {
        val gcdValue = gcd(a, b)
        return a / gcdValue to b / gcdValue
    }

    public fun CD(a: Int, b: Int, x: Int, y: Int): IntArray{
        //Common Denominator 통분


        val (a1, b1) = simplifyFraction(a, b)
        val (x1, y1) = simplifyFraction(x, y)
        if(b == y){
            return intArrayOf(a1+x1, b1)
        } else {
            val lcm = lcm(b1, y1)
            val num = a1 * (lcm / b1) + x1 * (lcm / y1)
            val denom = lcm
            val (p, q) = simplifyFraction(num, denom)
            return intArrayOf(p, q)
        }

    }
}

/**
 * level 0) 분수의 덧셈
 *
 *
 * 아직 못한거... 근데 뭐가 문젠지 잘 모르겠다
 * 테스트5랑 13만 자꾸 틀림...
 *
 */

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val commonDenom = denom1 * denom2 // 두 분수의 분모를 곱해서 통분
        val newNumer1 = numer1 * denom2 // 분자를 통분한 분수 1의 분자
        val newNumer2 = numer2 * denom1 // 분자를 통분한 분수 2의 분자
        val sumNumer = newNumer1 + newNumer2 // 두 분수의 분자를 더한 값

        // 더한 결과의 분자와 분모의 최대공약수를 구함
        val gcdValue = gcd(sumNumer, commonDenom)

        // 기약 분수로 만들어줌
        val reducedNumer = sumNumer / gcdValue
        val reducedDenom = commonDenom / gcdValue

        return intArrayOf(reducedNumer, reducedDenom)
    }

    // 최대공약수 계산 함수
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}

/**
 * level 0) 분수의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 *
 * 이건 수정한 정답
 *
 */