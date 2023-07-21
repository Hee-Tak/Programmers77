class Solution {
    fun solution(chicken: Int): Int {
        var service: Int = 0
        var coupon: Int = chicken
        while(coupon >= 10){
            service += coupon / 10
            coupon = coupon/10 + coupon%10
        }
        return service
    }
}

/**
 * level 0) 치킨 쿠폰
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 */