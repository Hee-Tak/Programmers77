import kotlin.math.sqrt

class Solution {
    fun solution(nums: IntArray): Int {
        var count = 0

        for(i in 0 until nums.size-2){
            for(j in i+1 until nums.size-1){
                for(k in j+1 until nums.size){
                    val sum = nums[i]+nums[j]+nums[k]
                    if(isPrime(sum)) count++
                }
            }
        }
        return count
    }
    fun isPrime(num: Int): Boolean{
        if(num < 2) return false
        for(i in 2..sqrt(num.toDouble()).toInt()){
            if(num%i == 0) return false
        }
        return true
    }
}