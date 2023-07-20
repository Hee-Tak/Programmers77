class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        var found_ID = false
        var found_PW = false
        for(person in db){
            if(id_pw[0] == person[0]){
                found_ID = true
                if(id_pw[1] == person[1]){
                    found_PW = true
                }
                break //id는 유니크함.
            }

        }

        return if(found_ID){
            if(found_PW){
                "login"
            } else{
                "wrong pw"
            }
        } else {
            "fail"
        }
    }
}
/**
 * level 0) 로그인 성공?
 * https://school.programmers.co.kr/learn/courses/30/lessons/120883
 *
 */

/**
 *
 * 근데 여기서 클린 코딩? 좀 더 깔끔한 구조로 정리해서 생각하자면.
 *
 * 일단 db 크기가 매우 클 경우에 위 경우처럼
 * for문으로 전체를 순회하면서 찾는것은 매우 비 효율적
 *
 */