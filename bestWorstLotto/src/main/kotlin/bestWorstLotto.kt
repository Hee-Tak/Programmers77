class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var num0: Int = 0
        for(i in lottos.indices){
            if(lottos[i]==0) num0++
        }

        /*
        var countArray: BooleanArray = BooleanArray(6)
        for(i in lottos.indices){
            for(j in win_nums.indices){
                if(lottos[i] == win_nums[j]){
                   countArray[i] = true
                }
            }
        }
        var count: Int = 0
        for(cnt in countArray){
            if(cnt) count++
        }
        */

        var countArray: IntArray = IntArray(6)
        for(i in lottos.indices){
            for(j in win_nums.indices){
                if(lottos[i] == win_nums[j]) countArray[i]++
            }
        }
        var count: Int = countArray.sum()

        answer += rankAnswer(num0 + count)
        answer += rankAnswer(count)

        return answer
    }

    fun rankAnswer(rank: Int): Int{
        return when(rank){
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}