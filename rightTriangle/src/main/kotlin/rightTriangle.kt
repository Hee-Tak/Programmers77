fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    //println(n)

    for(k in 1..n){
        for(s in 1..k){
            print("*")
        }
        println()
    }

}

/**
 * level 0) 직각삼각형 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */