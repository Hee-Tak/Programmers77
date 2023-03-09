class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var minX = dots[0][0]
        var maxX = dots[0][0]
        var minY = dots[0][1]
        var maxY = dots[0][1]

        for (dot in dots) {
            if (dot[0] < minX) minX = dot[0]
            if (dot[0] > maxX) maxX = dot[0]
            if (dot[1] < minY) minY = dot[1]
            if (dot[1] > maxY) maxY = dot[1]
        }

        val width = maxX - minX
        val height = maxY - minY

        return width * height
    }
}