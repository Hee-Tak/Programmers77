class Solution {
    fun solution(s: String): Boolean {
        println(s.length)
        if(!(s.length == 4 || s.length == 6)){
            return false
        }

        for(c in s){
            if(c.isLetter())    return false
        }
        return true
    }
}