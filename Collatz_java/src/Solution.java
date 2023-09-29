class Solution {
    public int solution(int number) {
        int steps = 0; // 작업 횟수
        long n = (long) number; //long으로 해주는 이유는 일단 예제에서 626331 일때 int 범위를 벗어나는 일이 발생

        // 주어진 숫자가 1이면 0 반환
        if (n == 1) {
            return 0;
        }

        while (n != 1) {
            // 500번 이상 반복하면 -1 반환
            if (steps >= 500) {
                return -1;
            }

            // 짝수인 경우
            if (n % 2 == 0) {
                n /= 2;
            } else { // 홀수인 경우
                n = n * 3 + 1;
            }

            steps++;
        }

        return steps;
    }
}

/**
 * level 1) 콜라츠 추측
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */