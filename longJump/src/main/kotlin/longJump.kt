class Solution {
    fun solution(n: Int): Long {
        var dp = IntArray(n+1)
        dp[1] = 1
        if(n>=2) dp[2] = 2
        for(i in 3..n){
            dp[i] = (dp[i-1]+dp[i-2]) % 1234567
        }
        return dp[n].toLong()
    }
} //동적 계획법 문제