class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        if("l" !in str_list && "r" !in str_list) return answer

        for(index in 0 until str_list.size){
            val str = str_list[index]
            if(str == "l"){
                for(i in 0 until index){
                    answer += str_list[i]
                }
                break
            } else if(str == "r"){
                for(i in index+1 until str_list.size){
                    answer += str_list[i]
                }
                break
            }

        }
        return answer
    }
}

/**
 * level 0) 왼쪽 오른쪽
 * https://school.programmers.co.kr/learn/courses/30/lessons/181890
 */