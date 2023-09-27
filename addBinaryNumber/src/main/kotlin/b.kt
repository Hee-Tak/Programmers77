class Solution {
    fun solution(bin1: String, bin2: String): String {
        var answer: String = ""

        var num1_10 = 0
        for (i in 0 until bin1.length) {
            if (bin1[i] == '1') { // 문자열 '1'과 비교해야 합니다.
                num1_10 += Math.pow(2.0, (bin1.length - 1 - i).toDouble()).toInt()
            }
        }

        var num2_10 = 0
        for (i in 0 until bin2.length) {
            if (bin2[i] == '1') { // 문자열 '1'과 비교해야 합니다.
                num2_10 += Math.pow(2.0, (bin2.length - 1 - i).toDouble()).toInt()
            }
        }
        val temp = num1_10 + num2_10 // 십진수 값

        answer = toBinaryNumber(temp) // 함수 이름을 수정

        return answer
    }

    private fun toBinaryNumber(n: Int): String {
        var binary = ""
        var num = n

        if (num == 0) {
            binary = "0"
        } else {
            while (num > 0) {
                val remainder = num % 2
                binary = remainder.toString() + binary
                num /= 2
            }
        }

        return binary
    }
}

/**
 * level 0) 이진수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */