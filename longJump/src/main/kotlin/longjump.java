class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] A = new long[2001];
        A[0] = 1; A[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            A[i] = (A[i-1] + A[i-2]) % 1234567;
        }
        answer = A[n];
        return answer;
    }
}