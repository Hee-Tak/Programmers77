import java.util.ArrayList;

class Solution2 {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};

        ArrayList<Integer> X = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    X.add(arr[i]);
                }
            } else {
                int size = X.size();
                ArrayList<Integer> temp = new ArrayList<>(X.subList(0, size - arr[i]));
                X = temp;
            }
        }

        answer = new int[X.size()];
        for(int i = 0; i < X.size(); i++){
            answer[i] = X.get(i);
        }

        return answer;
    }
}

/**
 * level 0) 빈 배열에 추가, 삭제하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181860?language=java
 */