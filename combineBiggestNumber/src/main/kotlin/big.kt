class Solution {

    fun solution(numbers: IntArray) : String {
        val randomNumber = (1..2).random()
        when(randomNumber) {
            1 -> return solution1(numbers)
            2 -> return solution2(numbers)
        }
        return ""
    }

    fun solution1(numbers: IntArray): String {
        println("solution1")
        val sortedNumbers = numbers.map { it.toString() }
            .sortedWith(Comparator { a, b ->
                (b + a).compareTo(a + b) // 두 수를 조합했을 때 큰 순서대로 정렬
            })

        // "0"만 있는 경우 "0" 반환, 그 외에는 숫자를 이어붙여 문자열로 반환
        return if(sortedNumbers[0] == "0") "0" else sortedNumbers.joinToString("")
    }


    fun solution2(numbers: IntArray): String {
        println("solution2")
        val sortedNumbers = numbers.sortedWith(Comparator { a, b ->
            val combinedA = "$a$b".toInt()
            val combinedB = "$b$a".toInt()
            combinedB - combinedA // 큰 순서대로 정렬
        })

        if (sortedNumbers.isNotEmpty() && sortedNumbers[0] == 0) {
            return "0" // 배열의 모든 원소가 0인 경우
        }

        return sortedNumbers.joinToString("") // 정렬된 숫자들을 문자열로 변환
    }
}


/**
 * level 2) 가장 큰 수 (3점)
 * https://school.programmers.co.kr/learn/courses/30/lessons/42746
 *
 * sol1 -> 정석대로 두 수를 조합했을때 큰순서대로 정렬해서 전체를 정렬하고 이어붙이기
 * sol2 -> 문제의 규칙을 찾은 방식. 첫번째 자릿수가 제일큰순서대로 정렬, 그다음 비교는 그다음자릿수 비교.
 * 만약에 일의자릿수만 존재하는 경우가 포함되어있는데 그다음자릿수를 비교할 필요가 있는경우
 * 예를 들어서 설명하면
 * 3, 30, 34 -> 3이 0~4 이기때문에 => 34, 3, 30
 * 5, 51, 52, 55, 58, 59 => 59, 58, 5, 55, 52, 51
 * 여기서 55의 두번째자릿수 5 가 그냥 한자릿수만 존재하는 5와 동일하기때문에
 * 5 와 55 이 두숫자는 순서가 교환돼도 상관x
 */