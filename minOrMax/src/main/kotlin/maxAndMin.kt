class Solution {
    fun solution(s: String): String {
        val num = s.split(" ").map{it.toInt()}
        val min = num.minOrNull() ?: return ""
        val max = num.maxOrNull() ?: return ""
        return "$min $max"
    }
}

class Solution {
    fun solution(s: String): String {
        //val num = s.split(" ").map{it.toInt()}
        //val min = num.minOrNull() ?: return ""
        //val max = num.maxOrNull() ?: return ""
        //return "$min $max"

        val arr = s.split(" ")
        val num = IntArray(arr.size)
        for(i in arr.indices){
            num[i] = arr[i].toInt()
        }
        val min = num.minOrNull() ?: return ""
        val max = num.maxOrNull() ?: return ""
        return "$min $max"
    }
}