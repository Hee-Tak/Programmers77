class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int n = 0;
        if(names.length % 5 == 0){
            n = names.length / 5;
        } else {
            n = (names.length / 5) + 1;
        }

        answer = new String[n];
        int index = 0;
        for(int i = 0; i < names.length; i += 5){
            answer[index] = names[i];
            index++;
        }
        return answer;
    }
}
/**
 * level 0) 5명 씩
 */