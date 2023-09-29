class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int public_number = 4;
        int size = phone_number.length() - public_number;
        StringBuilder str = new StringBuilder(); // StringBuilder 객체 초기화
        for(int i = 0; i < size; i++){
            str.append("*");
        }

        for(int i = size ; i < phone_number.length(); i++){
            str.append(phone_number.charAt(i)); // StringBuilder에 문자 추가
        }

        answer = str.toString(); //StringBuilder를 String으로 변환

        return answer;
    }
}

/**
 * level 1) 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */