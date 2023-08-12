class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val dp = IntArray(y+1) { Int.MAX_VALUE }
        dp[x] = 0
        for(i in x..y){
            if(dp[i] == Int.MAX_VALUE) continue

            if(i+n <= y){
                dp[i+n] = minOf(dp[i+n], dp[i]+1) //이건 최단경로를 의미하는 것임
                //i+n 까지 도달하는데 최단경로. 그러니까 최소연산횟수를 채택하는 의미
                //dp[i]+1 에서 +1의 의미는 연산을 한번 거쳐서 dp[i+n]으로 도달한것일테니 그것을 의미, 즉 연산횟수
            }

            if(i*2 <= y){
                dp[i*2] = minOf(dp[i*2], dp[i]+1)
            }

            if(i*3 <= y){
                dp[i*3] = minOf(dp[i*3], dp[i]+1)
            }

        }
        return if(dp[y] == Int.MAX_VALUE) -1 else dp[y]
    }
}

/**
 * level 2) 숫자 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/154538
 *
 * dp문제. Dynamic Programming 다이나믹 프로그래밍
 * 작은 문제의 해를 저장하고, 활용하여 큰 문제를 해결하는 개념
 */