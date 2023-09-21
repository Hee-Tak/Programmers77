class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        val key = k.toString()
        for(p in i..j){ //일단 첫번째로 여기서 바로 if(key in p.toString) answer++ 을 조졌는데 이건 반례가있음.
                                // key = 1, p = 11 이면 answer += 2 가 되어야하는데 answer++ 로 끝나므로 하나가 덜 증가됨
            val pString = p.toString()      //그래서 이렇게 String 각자리가 key인지 체크하는걸 for문으로 돌리는건데
            for(q in pString){              //여기서 pString 에서 q가 하나씩 떼오는거므로 q 는 Char인 상태임
                if(key in q.toString()) answer++        // 그래서 여기서 q.toString() 을 해줘야 key랑 비교가 됨
            }
        }
        return answer
    }
}

/**
 * level 0) k 의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120887
 */