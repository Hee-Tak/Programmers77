class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        long[] a = new long[n];
        for(int i = 0; i < n ; i++)
            a[i] = ((long)(x)*(i+1));
        answer = a;
        return answer;
    }
}