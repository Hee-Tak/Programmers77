class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val numP = p.toLong() // for문에서 여러번 형변환 하는거보다 여기서 미리 해두기
        val lenT = t.length //미리 길이 받아놓기 for문에서 indices 로 for문과 substring에서의 중복 제거
        val lenP = p.length
        for(s in 0 until lenT - lenP+1){ // if(s+p.length > t.length) break 까지 고려

            val s1 = t.substring(s, lenP+s).toLong()
            if(s1 <= numP){
                answer++
            }
        }
        return answer
    }
}
// 주의해야할점
//1 <= p <= 18 ---> Int 를 넘어서므로 런타임 에러가 뜬다면 크기 비교를 long 타입으로..




