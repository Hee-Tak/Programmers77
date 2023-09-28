class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer += n * 12000;
        answer += (k - (n / 10)) * 2000;
        return answer;
    }
}

/**
 * level 0) 양꼬치 (java)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */