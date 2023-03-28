class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        for(p in 0 until commands.size){
            //사실 i에서 j번째까지 숫자를 자르고 k번째수를 찾는건 i+k-1 이기때문에 j는 의미가 없음
            val i = commands[p][0]-1
            val j = commands[p][1]-1
            val k = commands[p][2]-1

            var arr = intArrayOf()
            for(q in i..j){
                arr += array[q]
            }
            arr.sort()
            answer += arr[k]
        }
        return answer
    }
}