import kotlin.math.*
/*
class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val width = dots.map { it[0] }.max() - dots.map { it[0] }.min()
        val height = dots.map { it[1] }.max() - dots.map { it[1] }.min()
        val area = width * height
        return area
    }
}
*/


class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val width = dots.map { it[0] }.maxOrNull()!! - dots.map { it[0] }.minOrNull()!!
        val height = dots.map { it[1] }.maxOrNull()!! - dots.map { it[1] }.minOrNull()!!
        return width * height
    }
}