package com.twent.part0.kotlin

fun main() {
    val result = test(1, c = 5)
    test2(name = "김태우", nickname = "태우", id = "xodn127")
    println(result)
    println(time1(1, 3))
    println(time2(1, 3))
}

// 2. 함수
fun test(a: Int, b: Int = 3, c: Int = 4): Int {
    println(a+b)
    return a + b
}

fun test2(name: String, nickname: String, id: String) = println("$name \n$nickname \n$id")

fun time1(a: Int, b: Int) : Int {
    return a * b
}

fun time2(a: Int, b: Int) = a * b