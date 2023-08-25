class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};

        for (String str : strArr) {
            if (!str.contains("ad")) {
                answer = addToArray(answer, str);
            }
        }

        return answer;
    }

    private String[] addToArray(String[] arr, String element) {
        String[] newArr = new String[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = element;
        return newArr;
    }
}

/**
 * level 0) ad 제거하기 (java)
 * https://school.programmers.co.kr/learn/courses/30/lessons/181870?language=java
 */