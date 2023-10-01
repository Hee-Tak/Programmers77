import java.util.*;

class Solution2 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        List<Pair<Integer, Double>> failure = new ArrayList<>();

        for(int stage = 1; stage <= N; stage++){
            int playersOnStage = 0;
            int playersFailed = 0;

            for(int player : stages){
                if(player >= stage) {
                    playersOnStage++;
                    if(player == stage){
                        playersFailed++;
                    }
                }
            }

            double failureRate = (playersOnStage != 0) ? (double) playersFailed / playersOnStage : 0.0;
            failure.add(new Pair<>(stage, failureRate));

        }

        Collections.sort(failure, (a, b) -> {
            if(a.getValue() > b.getValue()){
                return -1;
            } else if(a.getValue() < b.getValue()) {
                return 1;
            } else {
                return a.getKey() - b.getKey();
            }
        });


        answer = new int[N];
        for(int i = 0; i < N; i++){
            answer[i] = failure.get(i).getKey();
        }


        return answer;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

/**
 * level 1) 실패율
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java
 */