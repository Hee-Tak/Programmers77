class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt((double)n);
        if(sqrt * sqrt == n){
            answer = (sqrt+1) * (sqrt+1);
        } else {
            return -1;
        }

        return answer;

    }
}

/**
 * level 1) 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */