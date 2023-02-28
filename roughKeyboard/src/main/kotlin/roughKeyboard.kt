class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = IntArray(targets.size) {-1}
        // targets 배열의 크기와 같은 배열을 생성하면서 모든 원소를 -1 로 초기화 하는 코드 (람다)

        fun findPos(c: Char): Int? {
            var key: Int? = null
            for(i in keymap.indices){
                for(j in keymap[i].indices){
                    if(keymap[i][j] == c){
                        //print(keymap[i][j]); print(i); print(j); print("\t");
                        if(key == null || j < key){
                            key = j
                        }

                    }
                }
            }
            //println("${key}+1")
            return key
        }

        fun countPresses(target: String): Int {
            var count = 0
            for(c in target){
                var pos = findPos(c)
                if(pos == null){
                    return -1
                } else {
                    pos++
                    count += pos
                }

            }
            return count
        }

        for(i in targets.indices){
            answer[i] = countPresses(targets[i])
        }

        return answer
    }
}