class Solution {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        calculate(numbers, target, 0, 0);
        return answer;
    }

    private void calculate(int[] numbers, int target, int index, int currentSum) {
        if(index == numbers.length){
            if(currentSum == target){
                answer++;
            }
            return;
        }

        calculate(numbers, target, index + 1, currentSum + numbers[index]);

        calculate(numbers, target, index + 1, currentSum - numbers[index]);
    }


}

/**
 * level 2) 타겟 넘버 (java)
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 *
 * dfs
 */