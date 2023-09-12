class Solution {
    fun solution(n: Int): Int {
        var count: Int = 0
        for(i in 1..n){
            if(!isPrime(i)) {
                count++
            }
        }
        return count
    }

    private fun isPrime(number: Int): Boolean {
        if (number <= 1) {
            //return false // 1 또는 음수는 소수가 아님
            return true //합성수를 찾아야하기 때문에 임의로 이렇게 지정
        }

        if (number <= 3) {
            return true // 2와 3은 소수임
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false // 2 또는 3으로 나누어 떨어지면 소수가 아님
        }

        var i = 5
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false
            }
            i += 6
        }

        return true
    }
}

/**
 * level 0) 합성수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */