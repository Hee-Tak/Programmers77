class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var w: Int = 0
        var h: Int = 0
        for(i in sizes.indices){
            if(sizes[i][0] > sizes[i][1]){
                val temp = sizes[i][0]
                sizes[i][0] = sizes[i][1]
                sizes[i][1] = temp
            }
            if(sizes[i][0] > w) w = sizes[i][0]
            if(sizes[i][1] > h) h = sizes[i][1]
        }
        answer = w * h
        return answer
    }
}





//==============================================================
fun solution(sizes: Array<IntArray>): Int {
    var maxWidth = 0 // 가장 긴 가로 길이
    var maxHeight = 0 // 가장 긴 세로 길이

    // 모든 명함의 가로 길이와 세로 길이를 비교하여 가장 긴 길이를 찾음
    for (size in sizes) {
        val width = size[0]
        val height = size[1]
        if (width > height) {
            if (width > maxWidth) maxWidth = width
            if (height > maxHeight) maxHeight = height
        } else {
            if (height > maxWidth) maxWidth = height
            if (width > maxHeight) maxHeight = width
        }
    }

    // 모든 명함을 수납할 수 있는 가장 작은 지갑의 크기를 계산하여 반환
    return maxWidth * maxHeight
}
// 이건 CHAT GPT 가 짠거. Basic하게는 이게 기본적인 생각일듯. 위에 내가 푼게 좀 갑자기 떠오른 나한텐신기한 그런 아이디어일뿐