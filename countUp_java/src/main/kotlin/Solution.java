class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int N = end_num - start_num + 1;
        answer = new int[N];
        for(int i = start_num; i <= end_num; i++){
            answer[i-start_num] = i;
        }
        return answer;
    }
}

/**
 * level 0) 카운트 업
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */


