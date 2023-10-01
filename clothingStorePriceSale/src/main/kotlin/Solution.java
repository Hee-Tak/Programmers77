class Solution {
    public int solution(int price) {
        double answer = 0;

        if(price >= 500000){
            answer = (double)price * 0.8;
        } else if(price >= 300000){
            answer = (double)price * 0.9;
        } else if(price >= 100000){
            answer = (double)price * 0.95;
        } else {
            answer = (double)price;
        }

        return (int)answer;
    }
}

/**
 * level 0) 옷가게 할인 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */