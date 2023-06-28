import com.sun.jdi.connect.spi.TransportService.ListenKey
import java.util.LinkedList
import java.util.*

// 다시 생각해봐야할듯
class Solution1 {

    var visited : IntArray = intArrayOf()
    var arr : Array<HashMap<Int,Int>> = arrayOf()
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        var answer = 1

        visited = IntArray(N+1){-1}
        arr = Array(N+1) { HashMap() }

        for(i in road.indices){
            var startIndex = road[i][0]
            var endIndex = road[i][1]
            var distance = road[i][2]

            if(arr[startIndex].containsKey(endIndex)){
                if(arr[startIndex][endIndex]!! > distance){
                    arr[startIndex][endIndex] = distance
                    arr[endIndex][startIndex] = distance
                }
            } else{
                arr[startIndex][endIndex] = distance
                arr[endIndex][startIndex] = distance

            }

        }
        dijkstra(1)
        for(i in 2..N){
            if(visited[i] <= k && visited[i] != -1){
                answer++
            }
        }

        return answer
    }



    fun dijkstra(index: Int){
        visited[1] = 0
        var queue = LinkedList<Int>()
        queue.add(index)
        while(!queue.isEmpty()){

            var now = queue.poll()

            for(key in arr[now].keys){
                var dist = arr[now][key]

                if(visited[key] == -1){
                    queue.add(key)
                    visited[key] = dist!! + visited[now]
                } else if(visited[key] > visited[now] + dist!!){
                    visited[key] = visited[now] + dist
                    queue.add(key)
                }
            }
        }

    }






}




//=====================================================================================================================
fun main(){
    var solution = Solution1()

    var answer1 = solution.solution(5,
        arrayOf(intArrayOf(1,2,1), intArrayOf(2,3,3), intArrayOf(5,2,2), intArrayOf(1,4,2),
            intArrayOf(5,3,1), intArrayOf(5,4,2)),3)
    println(answer1)



    println(solution.solution(6,
        arrayOf(intArrayOf(1, 2, 1), intArrayOf(1, 3, 2), intArrayOf(2, 3, 2), intArrayOf(3, 4, 3), intArrayOf(3, 5, 2),
            intArrayOf(3, 5, 3), intArrayOf(5, 6, 1)
        ), 4))


    println("========================================================================================================")

    val solution1 = Solution2()

    answer1 = solution1.solution(5,
        arrayOf(intArrayOf(1,2,1), intArrayOf(2,3,3), intArrayOf(5,2,2), intArrayOf(1,4,2),
            intArrayOf(5,3,1), intArrayOf(5,4,2)),3)
    println(answer1)



    println(solution1.solution(6,
        arrayOf(intArrayOf(1, 2, 1), intArrayOf(1, 3, 2), intArrayOf(2, 3, 2), intArrayOf(3, 4, 3), intArrayOf(3, 5, 2),
            intArrayOf(3, 5, 3), intArrayOf(5, 6, 1)
        ), 4))
}



/*
class Solution2 {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        var answer = 0
        var source = 0
        val shortestDistances = dijkstra(road, source, N)

        for(i in shortestDistances.indices){
            println("Vertex ${i} : ${shortestDistances[i]}")
        }
        return answer
    }

    fun dijkstra(graph: Array<IntArray>, source: Int, N: Int): IntArray{
        val distances = IntArray(N) { Int.MAX_VALUE }
        val visited = BooleanArray(N)

        distances[source] = 0

        val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
        priorityQueue.offer(source to 0)    //큐에 원소를 추가

        while(priorityQueue.isNotEmpty()){
            val (vertex, dist) = priorityQueue.poll()   //큐에서 가장 우선순위 높은거 꺼내기

            if(visited[vertex]) continue

            visited[vertex] = true

            for(edge in graph){
                val destination = edge[1]
                val weight = edge[2]
                val newDistance = dist + weight
                if(newDistance < distances[destination]){
                    distances[destination] = newDistance
                    priorityQueue.offer(destination to newDistance)
                }
            }
        }

        return distances
    }
}*/

class Solution2 {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int{
        val graph = Array(N+1){ mutableListOf<Pair<Int, Int>>() }
        for(edge in road){
            val vertexA = edge[0]
            val vertexB = edge[1]
            val distance = edge[2]
            graph[vertexA].add(vertexB to distance)
            graph[vertexB].add(vertexA to distance)
        }
        val start = 1

        return dijkstra(graph, start, N, k)

    }


    fun dijkstra(graph: Array<MutableList<Pair<Int,Int>>>, start: Int, N: Int, k: Int): Int{
        val distances = IntArray(N+1) { Int.MAX_VALUE }
        val visited = BooleanArray(N+1)

        distances[start] = 0

        val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareBy{it.second})
        priorityQueue.offer(start to 0)

        while(priorityQueue.isNotEmpty()){
            val (vertex, dist) = priorityQueue.poll()

            if(visited[vertex]) continue

            visited[vertex] = true

            for(edge in graph[vertex]){
                val destination = edge.first
                val weight = edge.second
                val newDistance = dist + weight

                if(newDistance < distances[destination]){
                    distances[destination] = newDistance
                    priorityQueue.offer(destination to newDistance)
                }
            }
        }

        return distances.count { it <= k && it != Int.MAX_VALUE }
    }




}


/**
 * level 2) 배달
 * 경로 찾기 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/12978
 *
 * 맨위에께 다른사람꺼.
 *
 * 아래쪽의 풀이가 내꺼
 *
 */