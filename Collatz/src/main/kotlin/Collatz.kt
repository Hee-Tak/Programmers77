class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        answer = num
        var count = 0
        for(i in 1..500 ) {
            if(answer == 1){
                return count
            }

            if(answer%2 ==  0){
                answer /= 2
            } else {
                var temp = answer.toDouble()
                temp = temp * 3 +1
                answer = temp.toInt()
            } // 오버플로우 때문에 answer = answer * 3 +1 에서 그치지 못하고 이렇게 짬.
            count++
        }
        return -1
    }
}