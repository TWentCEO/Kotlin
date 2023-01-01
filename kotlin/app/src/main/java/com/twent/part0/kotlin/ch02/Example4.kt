package com.twent.part0.kotlin.ch02

// Ch04. 초기화 지연 lateinit, lazy
/*
정의: 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
목적 : 메모리를 효율적으로 사용하기 위해서 null safe한 value를 사용하기 위해

lateinit, var
    변수 타입을 지정해줘야함
    primitive 타입은 사용할 수 없음
    선언 후 나중에 초기화 해줘도 됨

lazy, val
    선언과 동시에 초기화를 해야함
    호출시점에 초기화가 이루어짐
 */

lateinit var text: String
lateinit var age: Integer

val test: Int by lazy {
    println("초기화 중")
    1000
}

fun main() {
    text = "name"
    age = Integer(10)

    println(text)

    println(test)
    println(test)
}