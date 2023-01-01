package com.twent.part0.kotlin.ch02

fun main() {

    // 1. 익명함수
    // fun()
    // 2. 변수처럼 사용되서 함수의 argument, return 으로 사용될 수 있음
    val a = fun(){println("hello")}
    // 3. 한 번 사용되고, 재사용되지 않는 함수

    val c : Int = 10
    val b : (Int) -> Int = { it * 10 }
    val d = { i :Int, j :Int -> i * j  }
    val f : (Int, String, Boolean) -> String = {_, b, _ -> b}
    println(b(3))
    println(d(3, 5))
    hello(10, b)

}

fun hello(a: Int, b: (Int) -> Int ): (Int) -> Int {
    println(a)
    println(b(20))

    return b
}