




































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
//======================================================================
import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        val graph = Graph(info.size)
        for (e in edges) {
            graph.addEdge(e[0], e[1])
        }

        val (totalSheep, totalWolf) = graph.bfs(0, info)

        return totalSheep
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

            val sheepBackup = totalSheep //백업용
            val wolfBackup = totalWolf   //백업용

            if (info[curr] == 0) totalSheep++ else totalWolf++

            if(totalSheep < totalWolf){
                totalSheep = sheepBackup //롤백
                totalWolf = wolfBackup   //롤백
                continue
            }

            for (adjNode in adjList[curr]) {
                if (!visited[adjNode]) {
                    visited[adjNode] = true
                    queue.offer(adjNode)
                }
            }
        }

        return Pair(totalSheep, totalWolf)
    }
}

//=============================================
/**
 * 위에 두개는 막힌상태인데, 아무래도 bfs말고 dfs를 써야하는듯함. 일단 이따가 마지막으로 bfs 테스트해보고
 * dfs로 넘어갈 예정
 */