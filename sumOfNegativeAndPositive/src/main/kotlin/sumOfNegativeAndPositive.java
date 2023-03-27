class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0 ; i < absolutes.length ; i++)
        {
            int k = 0;
            if(signs[i])
                k = absolutes[i];
            else
                k = absolutes[i] * (-1);
            answer += k;

        }
        return answer;
    }
}