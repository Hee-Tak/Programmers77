class Solution {
    fun solution(A: String, B: String): Int {
        var a : String = A

        if(a == B) return 0

        for(i in 1 until A.length){
            a = ShiftRight(a)
            if(a == B){
                return i
            }
        }

        return -1
    }

    private fun ShiftRight(str: String): String {
        var temp: String = ""
        temp += str[str.length-1]
        for(i in 0 until str.length-1){
            temp += str[i].toString()
        }
        return temp
    }
}

/**
 * level 0) 문자열 밀기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */