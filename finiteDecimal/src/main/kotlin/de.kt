class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        //val mapA = mutableMapOf<Int, Int>() //소인수분해용 map
        //val mapB = mutableMapOf<Int, Int>()
        val mapA = primeFactors(a)
        val mapB = primeFactors(b)

        return answer
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
 *
 *
 */