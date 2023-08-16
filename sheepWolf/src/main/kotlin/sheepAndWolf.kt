




































//=============================================================================



import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        val n = info.size
        val graph = Graph(n)

        for (edge in edges) {
            graph.addEdge(edge[0], edge[1])
        }

        val (totalSheep, totalWolf) = graph.bfs(0, info)

        return Math.min(totalSheep, totalWolf)
    }
}

private class Graph(val n: Int) {
    val adjList: Array<MutableList<Int>> = Array(n) { mutableListOf() }

    fun addEdge(u: Int, v: Int) {
        adjList[u].add(v)
        adjList[v].add(u)
    }

    fun bfs(start: Int, info: IntArray): Pair<Int, Int> {
        val visited = BooleanArray(n) { false }
        val queue: Queue<Int> = LinkedList()
        queue.offer(start)
        visited[start] = true

        var totalSheep = 0
        var totalWolf = 0

        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            totalSheep += info[curr]
            totalWolf += 1 - info[curr]

            for (next in adjList[curr]) {
                if (!visited[next]) {
                    visited[next] = true
                    queue.offer(next)
                }
            }
        }

        return Pair(totalSheep, totalWolf)
    }
}