class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val first = num_list.sliceArray(n until num_list.size)
        val second = num_list.sliceArray(0 until n)

        printTest(first)
        printTest(second)

        answer = first + second
        return answer
    }

    private fun printTest(arr: IntArray) {
        for(num in arr){
            print(num)
        }
        println()
    }
}

/**
 * level 0) 순서 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181891
 *
 * 디버깅비슷하게 해본다고 print 달아놓음
 *
 */