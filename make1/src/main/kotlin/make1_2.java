public class make1_2 {
    public int solution(int[] num_list) {
        int count = 0;
        for (int num : num_list) {
            int n = num;
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    count++;
                } else {
                    n = (n - 1) / 2;
                    count++;
                }

            }
        }
        return count;
    }
}


/**
 * level 0) 1로 만들기 (java)
 * https://school.programmers.co.kr/learn/courses/30/lessons/181880?language=java
 */