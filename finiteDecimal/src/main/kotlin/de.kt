class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        //val mapA = mutableMapOf<Int, Int>() //소인수분해용 map
        //val mapB = mutableMapOf<Int, Int>()
        val mapA = primeFactors(a)
        val mapB = primeFactors(b)

        val containsOtherKeysB = mapB.keys.any{ it != 2 && it != 5}

        if(containsOtherKeysB){
            val containsOtherKeysA = mapA.keys.any{ it != 2 && it != 5}
            if(containsOtherKeysA){
                for((key, valueB) in mapB){
                    if(key != 2 && key != 5){
                        val valueA = mapA[key] ?: 0
                        if(valueA != valueB){
                            return 2
                        }
                    }
                }
                return 1
            }
        }

        return 2
    }


    private fun primeFactors(n: Int): Map<Int, Int> {
        var num = n
        val factors = mutableMapOf<Int, Int>()
        var divisor = 2

        while(num > 1){
            while(num % divisor == 0){
                factors[divisor] = factors.getOrDefault(divisor, 0) + 1
                num /= divisor
            }
        }

        return factors
    }
}
/**
 * 위는 시간초과한 방법. 새로 생각해야함
 *
 */


class Solution {
    fun solution(a: Int, b: Int): Int {
        val simplifiedFraction = simplifyFraction(a, b)
        var denominator = simplifiedFraction.second

        while(denominator % 2 == 0){
            denominator /= 2
        }
        while(denominator % 5 == 0){
            denominator /= 5
        }

        return if(denominator == 1){
            1
        } else {
            2
        }
    }

    fun gcd(a: Int, b: Int): Int {
        return if(b == 0) a else gcd(b, a % b)
    }

    fun simplifyFraction(a: Int, b: Int): Pair<Int, Int> {
        val gcdValue = gcd(a, b)
        return a / gcdValue to b / gcdValue
    }
}

/**
 * level 0) 유한소수 판별하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120878
 *
 * 기약분수 만들때, 소인수분해해서 체크하는게 아니라
 * 두 수의 최대공약수로 나누어주는것을 먼저 생각한게 핵심이였다고 생각함
 * 그 이후에 핵심함수에서 분수 b 를 2 와 5로만 나누어지는지 체크까지
 *
 */