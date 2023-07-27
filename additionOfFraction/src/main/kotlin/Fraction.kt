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