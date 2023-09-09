class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = LCM(6, n) / 6;
        return answer;
    }

    private int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    private int GCD(int a, int b) {
        int num1 = a;
        int num2 = b;
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

/**
 * level 0) 피자 나눠 먹기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815?language=java
 */