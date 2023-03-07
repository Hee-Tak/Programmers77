import kotlin.math.*

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var sum: Long = 0
        val priceL = price.toLong()
        val moneyL = money.toLong()
        for(i in 1..count){
            sum += priceL * i
        }
        answer = moneyL-sum

        return if(answer <0){
            kotlin.math.abs(answer)
        } else{
            0
        }
    }
}