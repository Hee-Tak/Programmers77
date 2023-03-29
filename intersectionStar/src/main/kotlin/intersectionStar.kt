import kotlin.math.abs
import kotlin.math.ceil

class Solution {

    private fun calD(a: IntArray, b: IntArray): Long {
        return a[0].toLong() * b[1].toLong() - a[1].toLong() * b[0].toLong()
    }

    private fun pointX(a: IntArray, b: IntArray): Double {
        return ((a[1].toLong() * b[2].toLong() - a[2].toLong() * b[1].toLong()) / calD(a, b)).toDouble()
    }

    private fun pointY(a: IntArray, b: IntArray): Double {
        return ((a[2].toLong() * b[0].toLong() - a[0].toLong() * b[2].toLong()) / calD(a, b)).toDouble()
    }

    fun solution(line: Array<IntArray>): Array<String> {
        val list = mutableListOf<LongArray>()

        var minX = Long.MAX_VALUE
        var maxX = Long.MIN_VALUE
        var minY = Long.MAX_VALUE
        var maxY = Long.MIN_VALUE

        for (i in line.indices) {
            val a = line[i][0].toLong()
            val b = line[i][1].toLong()
            val e = line[i][2].toLong()

            for (j in i + 1 until line.size) {
                val c = line[j][0].toLong()
                val d = line[j][1].toLong()
                val f = line[j][2].toLong()

                val xUp = b * f - e * d
                val xDown = a * d - b * c

                val yUp = e * c - a * f
                val yDown = a * d - b * c

                if (xDown != 0L) {
                    val x = xUp.toDouble() / xDown.toDouble()
                    val y = yUp.toDouble() / yDown.toDouble()

                    if (x == ceil(x) && y == ceil(y)) {
                        list.add(longArrayOf(x.toLong(), y.toLong()))
                        minX = minOf(minX, x.toLong())
                        maxX = maxOf(maxX, x.toLong())
                        minY = minOf(minY, y.toLong())
                        maxY = maxOf(maxY, y.toLong())
                    }
                }
            }
        }

        val answerTemp = Array(maxY.toInt() - minY.toInt() + 1) { BooleanArray(maxX.toInt() - minX.toInt() + 1) }

        for (ints in list) {
            val x = (ints[0] - minX).toInt()
            val y = (ints[1] - maxY).toInt()

            answerTemp[abs(y)][abs(x)] = true
        }

        return answerTemp.map {
            it.map { if (it) "*" else "." }.joinToString("")
        }.toTypedArray()
    }
}