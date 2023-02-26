import java.util.*;

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val stack = Stack<Int>()
        for(element in ingredient){
            stack.push(element)

            if(stack.size >= 4){

                if(stack.elementAt(stack.size-4) == 1
                    && stack.elementAt(stack.size-3) == 2
                    && stack.elementAt(stack.size-2) == 3
                    && stack.elementAt(stack.size-1) == 1) {
                    answer ++;
                    stack.pop(); stack.pop(); stack.pop(); stack.pop();
                }

            }
        }

        return answer
    }
}