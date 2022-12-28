package com.twent.part0.kotlin

fun main() {
    for (i in 0 until 11) {
        print(i)
    }

    println()

    for (i in 0 .. 11) {
        print(i)
    }

    println()

    for (i in 10 downTo 1) {
        print(i)
    }

    println()

    for (i in 10 downTo 1 step 2) {
        print(i)
    }

    println()

    var c = 1
    while (c < 11) {
        print(c)
        c++
    }
}