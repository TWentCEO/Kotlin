package com.twent.part0.kotlin

fun main() {
    max(10, 15)
    isHoliday("금") // false
}

fun max(a: Int, b: Int) {
    val result = if (a > b) {
        println(a)
    }
    else {
        println(b)
    }
    println(result) // kotlin.Unit

    val result2 = if (a > b) a else b
    println(result2) // 15
}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: Any) {
    val result = when (dayOfWeek) {
        "토",
        "일" -> if (dayOfWeek == "토") "좋아" else "너무 좋아"
        in 2..4 -> {}
        in listOf(1, 3, 4) -> {}
        else -> false
    }
    println(result)
}