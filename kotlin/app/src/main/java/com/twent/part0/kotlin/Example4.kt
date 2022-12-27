package com.twent.part0.kotlin

fun main() {
    val user = User("김태우", 10)
    println(user.age)
    Kid("아이", 3, "male")

}

open class User(open val name: String, open var age: Int = 100)

class Kid(override val name: String, override var age: Int) : User(name, age) {
    var gender: String = "male"

    init {
        println("초기화 중 입니다.")
    }

    // 부생성자
    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("주 생성자 호출")
    }
}