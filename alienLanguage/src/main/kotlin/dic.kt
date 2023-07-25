class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        val spell_size = spell.size
        for(d in dic){
            if(d.length != spell_size) continue
            var aSet = mutableSetOf<Char>()
            for(c in d){
                if(c.toString() in spell){
                    aSet.add(c)
                } else {
                    break
                }
            }
            if(aSet.size == spell_size) return 1
        }
        return 2
    }
}

/**
 * level 0) 외계인 사전
 * https://school.programmers.co.kr/learn/courses/30/lessons/120869
 */