class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int p = a;
        int q = b;
        if(a > b)
        {
            p = b;
            q = a;
        }
        for(int i = p; i <= q; i++)
            answer += i;


        return answer;
    }
}