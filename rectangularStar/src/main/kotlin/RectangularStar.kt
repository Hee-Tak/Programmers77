fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    //println(a + b)
    for(i in 1..b){
        for(j in 1..a){
            print("*")
        }
        println()
    }
}