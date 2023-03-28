import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        int[] a = new int[commands.length];
        int a_index = 0;
        for(int p = 0; p < commands.length; p++)
        {
            int length1 = commands[p][1] - commands[p][0] +1 ;
            int[] temp = new int[length1];
            int cnt = 0;
            for(int q = commands[p][0]-1; q < commands[p][1]; q++)
            {
                temp[cnt] = array[q];
                cnt++;
                System.out.print(array[q] + " ");
            }
            Arrays.sort(temp);
            System.out.print("\t"+temp[commands[p][2]-1]);
            System.out.println();

            a[a_index] = temp[commands[p][2]-1];
            a_index++;
        }
        answer = a;
        return answer;
    }
}