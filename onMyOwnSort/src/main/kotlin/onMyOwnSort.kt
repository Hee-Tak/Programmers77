class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val arr = mutableListOf<String>()
        for (s in strings) {
            arr.add("" + s[n] + s)
        }
        arr.sort()
        val answer = mutableListOf<String>()
        for (s in arr) {
            answer.add(s.substring(1))
        }
        return answer.toTypedArray()
    }
}//이는 가장 직관적인 방법

// ==================================================
// 원래는 문자열들의 n번째 문자를 아스키코드로 바꿔서 그값으로 정렬하고
// n번째 문자가 같은 문자열이 여럿일 경우에는 사전순으로 앞선 문자열이 앞쪽에 위치한다 했으니,
// n+1번째 문자 아스키코드까지 합해서 생각하려했고 좀 더확실하게 계산하기 위해 n번째문자는 *1000, n+1번째 문자는 아스키코드값을 그대로 더해서 생각하려고 했었음
// 여기서 map 까지 활용해보려 했었음 그게 아래의 코드.
class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        var map = mutableMapOf<String, Int>()
        for(s in strings){
            if(s.length <= n) {  // 문자열 길이가 n보다 작으면 map에 추가하지 않음
                map[s] = s[n].toInt()
            } else {
                map[s] = s[n].toInt() * 1000 + s[n+1].toInt()  // 값이 클수록 우선순위 차례대로 매겨줄려고 일부러 *1000
            }
        }
        val sortedByValue = map.entries.sortedBy{it.value}
        answer = sortedByValue.map{it.key}.toTypedArray()
        return answer
    }
} // 그러나 실패 (놓친 테스트케이스가 존재했음)
//===============================================
// 아래는 다른방법으로 다시 똑같은 방법으로 생각해봤었던건데
class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val sorted = strings.sortedWith(compareBy({ it[n].toInt() }, { if (it.length > n+1) it[n+1].toInt() else 0 }, { it }))
        return sorted.toTypedArray()
    }
} // 이거 또한 위의 이유와 동일한 이유로 실패