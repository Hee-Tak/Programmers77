class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        for(i in s.indices){
            val rotated = s.substring(i) + s.substring(0, i)
            if(isValid(rotated)){
                answer++
            }
        }
        return answer
    }

    fun isValid(s: String): Boolean { //유효한 괄호 짝이 있는지 확인하는 함수
        val stack = mutableListOf<Char>()
        for(char in s){
            if(char in "([{"){
                stack.add(char)
            } else if(char in ")]}"){
                if(stack.isEmpty()){
                    return false
                }

                if(char == ')' && stack.last() == '('){
                    stack.removeAt(stack.size-1)
                } else if(char == ']' && stack.last() == '['){
                    stack.removeAt(stack.size-1)
                } else if(char == '}' && stack.last() == '{'){
                    stack.removeAt(stack.size-1)
                } else {
                    return false
                }
            }
        }
        return stack.isEmpty()
    } // 적절한 짝이 나오지 않는다면 false를 반환. shift left를 수행한 이후 돌아와서 다시 적절한 짝을 찾는 과정을 반복. 이 과정에서 shift left가 몇번 되는지를 세면 된다.

}