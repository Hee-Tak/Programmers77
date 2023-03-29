class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = IntArray(id_list.size)
        val map = HashMap<String, HashSet<String>>()
        val idxMap = HashMap<String, Int>()
        for (i in id_list.indices) {
            val name = id_list[i]
            map[name] = HashSet()
            idxMap[name] = i
        }

        for (s in report) {
            val str = s.split(" ").toTypedArray()
            val from = str[0]
            val to = str[1]
            map[to]?.add(from)
        }

        for (i in id_list.indices) {
            val send = map[id_list[i]]
            if (send?.size ?: 0 >= k)
                send?.forEach { name -> answer[idxMap[name] ?: 0]++ }
        }

        return answer
    }
}