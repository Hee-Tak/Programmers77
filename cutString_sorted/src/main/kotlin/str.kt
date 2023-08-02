class Solution {
    fun solution(myString: String): Array<String> {
        return myString.split("x").filter{ it.isNotEmpty() }.sorted().toTypedArray()
    }
    //sorted() 함수는 원본 list 를 변경하지 않고 새로운 정렬된 리스트를 반환한다.
    //따라서, sorted() 함수를 호출하면 원본 리스트는 변경되지 않고 정렬된 결과를 새로운 리스트로 얻을 수 있음.
    //list의 형태가 아닌, Array<String> 꼴을 원했기 때문에 toTypedArray() 를 끝에 붙여줘야했음.

}

/**
 * level 0) 문자열 잘라서 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */

