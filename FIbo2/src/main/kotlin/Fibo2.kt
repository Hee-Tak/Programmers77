class Solution {
    fun solution(n: Int): Int {
        return fibonacci(n) % 1234567
    }

    fun fibonacci(n: Int): Int{
        if(n==0){
            return 0
        } else if(n==1 || n==2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2)
        }
    }
}



class Solution {
    fun solution(n: Int): Int {
        val mod = 1234567
        var a = 0
        var b = 1
        for(i in 2..n){
            val c = (a+b) % mod
            a = b
            b = c
        }
        return b
    }
}




// 흠