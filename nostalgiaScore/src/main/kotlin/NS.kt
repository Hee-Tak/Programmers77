class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        val map = mutableMapOf<String, Int>()
        for(i in 0..name.size-1){
            map.put(name[i], yearning[i])
        }
        for(ph in photo){
            var sum = 0
            for(key in map.keys){
                if(key in ph){
                    sum += map[key] ?: 0 //value
                }
            }
            answer += sum
        }

        return answer
    }
}