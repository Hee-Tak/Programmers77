class Solution {
    fun solution(x: Int): Boolean {

        val sum = x.toString().map{it.toString().toInt()}.sum()
        //.map{it.toString().toInt()} 는 문자열의 각 자리수를 Int로 변환하여 리스트로 만드는 것
        //map 함수는 리스트의 각 요소를 인자로 받은 함수의 적용한 결과를 리스트로 반환

        return x % sum == 0
    }
}