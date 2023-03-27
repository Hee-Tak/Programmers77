class Solution {
    fun solution(numbers: IntArray): Int {
        var sum = 0
        for(i in 0..9){
            var isExist = false
            for(number in numbers){
                if(i == number){
                    isExist = true
                    break
                }
            }
            if(!isExist){
                sum += i
            }
        }
        return sum
    }
}


//========================================================

class Solution {
    fun solution(numbers: IntArray): Int {
        val exist = BooleanArray(10)
        for(num in numbers){
            exist[num] = true
        }
        var answer = 0
        for(i in 0..9){
            if(!exist[i]){
                answer += i
            }
        }
        return answer
    }
}
//==========================================================

class Solution {
    fun solution(numbers: IntArray): Int {
        return (0..9).filter{it !in numbers}.sum()
    }
}