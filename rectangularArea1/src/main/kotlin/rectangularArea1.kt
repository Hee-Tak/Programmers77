import kotlin.math.*

class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val width = dots.map { it[0] }.max() - dots.map { it[0] }.min()
        val height = dots.map { it[1] }.max() - dots.map { it[1] }.min()
        val area = width * height
        return area
    }
}