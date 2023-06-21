class Solution {
    fun solution(n: Int): Int {

        var cnt: Int = 0
        var i: Int = 1
        while(i * i <= n){
            if(i*i == n){
                cnt++
            }  else if(n % i == 0){
                cnt += 2
            }

            i++
        }

        return if(cnt % 2 == 0){
            2 //약수의 개수가 짝수이므로 제곱수 x
        } else {
            1 //약수의 개수가 홀수이므로 제곱수 o
        }

    }
}

/**
 * level 0) 제곱 수 판별하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120909
 *
 * 일반적으로 떠오르는 방법보다 시간을 훨씬 단축시킨 방법 (약수의 개수 구하기)
 */