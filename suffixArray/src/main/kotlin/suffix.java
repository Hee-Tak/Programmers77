import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> suffixes = new ArrayList<>();

        for(int i = 0 ; i < my_string.length(); i++){
            suffixes.add(my_string.substring(i));
        }

        Collections.sort(suffixes);

        return suffixes.toArray(new String[0]);
    }
}

/**
 * level 0) 접미사 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909?language=java
 *
 * 자바 ver
 */