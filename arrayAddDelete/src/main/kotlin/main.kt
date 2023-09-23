//class main {
    fun main() {
        val arr = intArrayOf(3, 2, 4, 1, 3)
        val flag = booleanArrayOf(true, false, true, false, false)

        val solution1 = Solution1()
        val solution2 = Solution2()

        val result1 = solution1.solution(arr, flag)
        val result2 = solution2.solution(arr, flag)

        println(result1.joinToString(", ")) // 결과 배열 출력
        println(result2.joinToString(", ")) // 결과 배열 출력
    }
//}
// 코틀린에서 main 함수는 최상위 수준에 있어야한다.
// 따라서 클래스 내부에 main 함수를 정의하면 실행되지 않는다.