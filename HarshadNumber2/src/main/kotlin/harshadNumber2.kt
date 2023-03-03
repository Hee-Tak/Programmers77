fun solution(x: Int): Boolean {
    var n = x
    var digitsSum = 0
    while (n > 0) {
        digitsSum += n % 10
        n /= 10
    }
    return x % digitsSum == 0
}