import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Map<Integer, Boolean> map = new HashMap<>();
        for(int i = 1; i <= 9; i++){
            map.put(i, false);
        }

        for(int i = 1; i <= 9; i++){
            if(contains(numbers, i)){
                map.put(i, true);
            }
        }

        for(Map.Entry<Integer, Boolean> entry: map.entrySet()){
            if(!entry.getValue()){
                answer += entry.getKey();
            }
        }



        return answer;
    }

    private boolean contains(int[] arr, int n) {
        for(int element : arr){
            if(element == n) return true;
        }

        return false;
    }
}

/**
 * level 1) 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */