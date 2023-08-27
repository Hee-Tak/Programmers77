class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val alphabet = mutableMapOf(
            'a' to 0, 'b' to 1, 'c' to 2, 'd' to 3, 'e' to 4, 'f' to 5, 'g' to 6,
            'h' to 7, 'i' to 8, 'j' to 9, 'k' to 10, 'l' to 11, 'm' to 12, 'n' to 13,
            'o' to 14, 'p' to 15, 'q' to 16, 'r' to 17, 's' to 18, 't' to 19, 'u' to 20,
            'v' to 21, 'w' to 22, 'x' to 23, 'y' to 24, 'z' to 25)
        for(i in 0 until skip.length){
            alphabet.remove(skip[i])
        }

        val rearrangedAlphabet = mutableMapOf<Char, Int>()
        var value1 = 0
        for((key, _) in alphabet){
            rearrangedAlphabet[key] = value1
            value1++
        }
        println(rearrangedAlphabet)

        val arr = s.map { rearrangedAlphabet[it] }
        val newArr = arr.map { it?.plus(index)?.rem(rearrangedAlphabet.size) }
        println(newArr)
        answer = newArr.joinToString("") { key ->
            rearrangedAlphabet.entries.find { it.value == key }?.key.toString()
        }
        return answer


    }
}

/**
 * level 0) 둘만의 암호 (2점)
 * https://school.programmers.co.kr/learn/courses/30/lessons/155652
 *
 * null처리, 등등 사실 디테일한거 뒷부분이 좀 힘들었다..
 */