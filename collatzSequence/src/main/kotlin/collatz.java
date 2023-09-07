import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        int x = n;
        answerList.add(x);

        while(x != 1){
            switch(x%2){
                case 0: x /= 2; break;
                case 1: x = 3 * x + 1; break;
            }
            answerList.add(x);
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

/**
 * level 0) 콜라츠 수열 만들기 (java)
 * https://school.programmers.co.kr/learn/courses/30/lessons/181919?language=java
 */