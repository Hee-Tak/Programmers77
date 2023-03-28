class Solution {
    fun solution(n: Int): Int {
        var trit = ""
        var num = n
        while(num>0){
            val remainder = num % 3
            num /= 3
            trit = remainder.toString() + trit
        }
        var trit_reverse = trit.reversed()
        var result = 0
        var power = 1
        for(i in trit_reverse.length-1 downTo 0){
            result += (trit_reverse[i] - '0') * power
            power *= 3
        }
        return result
    }
}