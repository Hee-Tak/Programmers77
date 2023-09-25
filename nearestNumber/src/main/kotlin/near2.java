class near2 {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        for(int a : array){
            if(Math.abs(a - n) <= Math.abs(answer - n)){
                if(Math.abs(a-n) == Math.abs(answer-n)){
                    answer = Math.min(a, answer);
                } else {
                    answer = a;
                }
            }
        }
        return answer;
    }
}

/**
 * level 0) 가까운 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890?language=java
 */