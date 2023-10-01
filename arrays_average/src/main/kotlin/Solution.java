class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int temp = 0;
        for(int num : numbers){
            temp += num;
        }

        answer = (double)temp / (double)numbers.length;
        return answer;
    }
}

/**
 * level 0) 배열의 평균값
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */