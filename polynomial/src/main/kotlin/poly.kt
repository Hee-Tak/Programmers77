class Solution {
    fun solution(polynomial: String): String {
        var answer: String = ""
        val poly = polynomial.split(" ")
        var a: Int = 0
        var b: Int = 0
        for(p in poly){
            if("x" in p){
                if(p == "x"){
                    a += 1
                } else {
                    a += p.substring(0, p.length-1).toInt()
                }

            } else if(p == "+"){
                continue
            } else {
                b += p.toInt()
            }
        }

        if(a==0 && b==0){
            return answer
        } else if(a == 0){
            answer += b.toString()
        } else if(b == 0){
            if(a == 1){
                answer += "x"
            }else {
                answer += "${a}x"
            }
        } else {
            if(a == 1){
                answer += "x + $b"
            } else{
                answer += "${a}x + $b"
            }
        }

        return answer
    }
}

/**
 * level 0) 다항식 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120863
 *
 * 아니 푸는데 어렵긴했는데 이게 8점짜리네..
 */