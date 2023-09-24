class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        for(num in num_list){
            var n = num

            while(n > 1){
                if(n % 2 == 0){
                    n /= 2
                    answer++
                } else {
                    n = (n-1) / 2
                    answer++
                }
            }


        }

        return answer
    }
}

/**
 * level 0) 1로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181880?language=kotlin
 */