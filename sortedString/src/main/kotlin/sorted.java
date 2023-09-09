import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        return sortedString;
    }
}

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] charArray = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}






/**
 * level 0) 문자열 정렬하기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120911?language=java
 */