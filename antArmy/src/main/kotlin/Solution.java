class Solution {
    public int solution(int hp) {
        int answer = 0;
        int HP = hp;
        int general = 5;
        int soldier = 3;
        int priv = 1;

        answer += HP / general;
        HP %= general;

        answer += HP / soldier;
        HP %= soldier;

        answer += HP / priv;
        HP %= priv;

        return answer;
    }
}

/**
 * level 0) 개미 군단
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */