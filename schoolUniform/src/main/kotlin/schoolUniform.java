import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int m = lost.length; // 못듣는 사람의 수

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++)
            for(int j = 0; j < reserve.length; j++)
                if(lost[i] == reserve[j])
                {
                    m--;
                    lost[i] = -5;
                    reserve[j] = -5;
                    break;
                }




        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                //if(lost[i]+2 <= reserve[j]) break;
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j])
                {
                    m--;
                    reserve[j] = -5;
                    break;
                }

            }
        }
        answer = n - m;

        return answer;
    }
}