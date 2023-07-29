//[".xx...xx.",
//"x..x.x..x",
//"x...x...x",
//".x.....x.",
//"..x...x..",
//"...x.x...",
//"....x...."]
//그림 예제


//["..xxxx......xxxx..",
//"..xxxx......xxxx..",
//"xx....xx..xx....xx",
//"xx....xx..xx....xx",
//"xx......xx......xx",
//"xx......xx......xx",
//"..xx..........xx..",
//"..xx..........xx..",
//"....xx......xx....",
//"....xx......xx....",
//"......xx..xx......",
//"......xx..xx......",
//"........xx........",
//"........xx........"]
//그림 예제. k=2


class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(pic in picture){
            var str: String = ""
            for(p in pic){
                for(i in 1..k){
                    str += p        //가로 확대
                }
            }
            for(i in 1..k){
                answer += str       //세로 확대
            }
        }
        return answer
    }
}

/**
 * level 0) 그림 확대
 * https://school.programmers.co.kr/learn/courses/30/lessons/181836
 *
 * 그림 모양보니까 뭔소린지 알겠네
 */