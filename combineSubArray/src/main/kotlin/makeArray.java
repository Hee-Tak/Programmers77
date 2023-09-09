import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};

        for(int[] inter : intervals){
            for(int i = inter[0]; i <= inter[1]; i++){
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = arr[i];
            }
        }

        return answer;
    }
}

/**
 * level 0) 배열 만들기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895?language=java
 */