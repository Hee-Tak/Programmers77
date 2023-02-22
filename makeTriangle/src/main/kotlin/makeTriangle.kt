class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        //var max: Int = sides[0]
        //var middle: Int = sides[1]
        //var min: Int = sides[2]
        /*
        for(i in sides) {
            if(max < sides[i]){
                max = sides[i]
            }
        }*/

        var arr = sides
        arr.sort()
        if(arr[2] < arr[0]+arr[1]) {
            answer = 1
        } else {
            answer = 2
        }

        return answer
    }
}