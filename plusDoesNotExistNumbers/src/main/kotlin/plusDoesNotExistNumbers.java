import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;

        System.out.println(Arrays.toString(numbers));
        //Arrays.sort(numbers);
        int total = 45; // 0~9 의 합
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        answer = total - sum;
        return answer;

    }

}