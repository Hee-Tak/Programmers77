class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int americano_price = 4500;
        int cafelatte_price = 5000;
        for(String ord : order){
            if(ord.contains("americano")){
                answer += americano_price;
            } else if(ord.contains("cafelatte")){
                answer += cafelatte_price;
            } else if(ord.equals("anything")){
                answer += americano_price;
            }
        }
        return answer;
    }
}
/**
 * level 0) 커피 심부름
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 */