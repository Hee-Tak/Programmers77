class Solution {
    public int solution(int angle) {

        if(angle > 0 && angle < 90){
            return 1;
        } else if (angle == 90){
            return 2;
        } else if (angle > 90 && angle < 180){
            return 3;
        } else if (angle == 180){
            return 4;
        } else {
            throw new IllegalArgumentException("Invalid angle: "+ angle);
        }

    }
}

/**
 * level 0) 각도기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */