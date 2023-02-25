class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val list = ingredient.toMutableList()
        for( i in list.size -1 downTo 2) {
            if(list[i-2] == 1 && list[i-1] == 2 && list[i] == 3){
                list.removeAt(i)
                list.removeAt(i-1)
                list.removeAt(i-2)
                answer++
            }
        }
        return answer
    }
}

// 꿀팁 : 리스트에서 요소를 삭제할 때는 인덱스가 변하지 않도록 조심해야한다.
//보통은 리스트를 거꾸로 순회하면서 삭제하는 방법을 많이 사용한다.
// for문을 역순으로 돌리거나 리스트를 reverse() 메소드로 뒤집은 후에 for문을 순회한다.

// 오답 이유 : 시간초과인거같음 + 123 이아니라 1231 을 지워야하는데. 애초에 잘못된 코드긴 했구나
