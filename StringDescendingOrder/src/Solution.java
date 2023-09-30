import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray); //오름차순정렬
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}

/**
 * level 1) 문자열 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */