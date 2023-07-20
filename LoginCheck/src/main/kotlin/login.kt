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