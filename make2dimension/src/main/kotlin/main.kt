
fun main(){
    val num_list = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val n = 2

    val sol = dimension2().solution(num_list, n)

    for(i in 0 until (num_list.size / n)){
        for(j in 0 until n){
            print("${sol[i][j]} ")
        }
        println()
    }
}