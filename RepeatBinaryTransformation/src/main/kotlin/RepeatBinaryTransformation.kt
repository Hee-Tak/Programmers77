class Solution {
    fun solution(s: String): IntArray {
        var str = s
        var deleteCount = 0
        var count = 0
        while(str != "1"){
            val zeroCount = str.count{it == '0'}
            deleteCount += zeroCount
            str = Integer.toBinaryString(str.length - zeroCount)
            count++
        }
        return intArrayOf(count, deleteCount)
    }
}

//===============================================================
class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var str = s
        var deleteCount: Int = 0
        var count: Int = 0
        while(str != "1"){
            val strOriginal = str.length
            str = str.replace("0","")
            deleteCount += strOriginal - s.length
            str = decimalToBinary(s.length)
            count++
        }
        answer = intArrayOf(deleteCount, count)
        return answer
    }

    fun decimalToBinary(decimal: Int): String {
        var quotient = decimal
        var binary = ""
        while(quotient > 0){
            val remainder = quotient %2
            binary = "$remainder$binary"
            quotient /= 2
        }
        return if(binary.isEmpty()){
            "0"
        } else {
            binary
        }

    }
}
//==========================================================