class Solution {
    fun solution(n: Int): Int {
        return if(n%2 == 0){
            var sum = 0
            for(i in 2..n step 2){
                sum += pow(i)
            }
            sum
        } else {
            var sum = 0
            for(i in 1..n step 2){
                sum += i
            }
            sum
        }
    }

    private fun pow(n: Int): Int{
        return n*n
    }
}


/**
 * level 0) 홀짝에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */