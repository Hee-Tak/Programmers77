class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int size = strlist.length;
        answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
/**
 * level 0) 배열 원소의 길이
 * https://school.programmers.co.kr/learn/courses/30/lessons/120854
 */