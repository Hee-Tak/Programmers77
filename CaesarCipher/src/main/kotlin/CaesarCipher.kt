class Solution {
    fun solution(s: String, n: Int): String {
        val answer = StringBuilder()

        for(c in s){
            when{
                c.isLowerCase() -> answer.append(((c-'a'+n)%26 + 'a'.toInt()).toChar())
                c.isUpperCase() -> answer.append(((c-'A'+n)%26 + 'A'.toInt()).toChar())
                //c-'a' 는 c의 현재 위치(인덱스라 생각해도 될듯)를 말하고 여기에 +n 하고 알파벳이니 %26 (mod 계산)
                //(c-'a'+n)%26 을 a 의 아스키코드값에 더해주고(.toInt()를 써서 데이터형 바꿔줌으로써)
                // 다시 .toChar()로 바꿔서 answer 에 append
                else -> answer.append(c)
            }
        }

        return answer.toString()
    }
}