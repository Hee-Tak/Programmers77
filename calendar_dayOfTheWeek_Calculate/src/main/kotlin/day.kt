class Solution {
    fun solution(a: Int, b: Int): String {
        val month_list = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val week_day_list: Array<String> = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        //2016.01.01 는 FRI 이기 때문에, FRI 가 제일 처음오게해서 정렬

        var total_day = 0
        for(i in 0 until a-1){
            total_day += month_list[i]
        }
        total_day += b - 1

        val day = week_day_list[total_day % 7]

        return day
    }
}

/**
 * level 1) 2016년
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 *
 * 날짜 계산기
 */