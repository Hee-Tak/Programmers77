class Solution1 {
    fun solution(N: Int, stages: IntArray): IntArray {
        val failure = mutableListOf<Pair<Int, Double>>()

        for(stage in 1..N){
            val playersOnStage = stages.count { it >= stage}
            val playersFailed = stages.count { it == stage }
            val failureRate = if(playersOnStage != 0) playersFailed.toDouble() / playersOnStage.toDouble() else 0.0
            failure.add(Pair(stage, failureRate))
        }

        val sortedStages = failure.sortedWith(compareByDescending<Pair<Int, Double>> { it.second }.thenBy { it.first })

        return sortedStages.map { it.first }.toIntArray()
    }
}

/**
 * level 1) 실패율
 * 2019 카카오
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=kotlin
 */