package com.twent.part0.kotlin

fun main() {
    var name : String = "상아"
    var number : Int = 10

    var nickname : String? = "태우"
    var secondNumber :  Int? = null

//    val result = if (nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }

    nickname = "김태우"

    val size = nickname?.length

    println(size)
}