package com.twent.part0.kotlin.ch02

// Chapter 3. Scope Function(범위 지정 함수)
/**
 * 코틀린 표준 라이브러리에서 제공하는 확장 함수
 * 목적 : 간결성, 명료성, 유지보수 용이성
 * 정의 : 객체의 컨텍스트 내에서, 실행 가능한 코드 블럭을 만드는 함수
 *      호출 시, 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근 가능
 *      context : 문맥, 맥락, 전후 사정
 * 수신 객체 (receiver) : 확장 함수가 호출되는 대상이 되는 값(객체)
 * 수신 객체 지정 람다 (lambda with receiver) : 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
 * 차이점
 *  수신 객체 접근 방법 : this, it
 *  Return : 수신 객체, 마지막 행(lambda result)
 *
 * let : null 체크를 해야할 때, 지역 변수를 명시적으로 표현 해야할 때
 * run : 객체를 초기화 하고 리턴 값이 있을 때
 * apply : 객체 초기화
 * also : 수신객체를 명시적으로 사요하고 싶을 때, 로그를 남길 때
 * with : 객체 초기화, 람다 리턴 값이 필요 없을 때
 */

fun main() {
    // let, run, apply, also
    // with

    // 1.let
    val user = User("김태우", 24, true)

    // 수신객체.let { it or (설정 가능) ->
    //
    // 마지막 줄 // return
    // }
    val userAge = user.let {
        user.age
    }

    println(userAge)

    // 2. run
    // 수신객체.run { this ->
    //
    // 마지막 줄
    // }

    val kid = User("어린이", 4, false)

    val kidAge = kid.run {
        age
    }

    println(kidAge)

    // 3. apply
    // 수신객체.apply {
    //
    // }
    // return 값이 수식 객체

    val female = User("김태순", 20, false, true)

    val femaleValue = female.apply {
        hasGlasses = false
    }

    println(femaleValue.hasGlasses)

    // 4. also
    // 수신객체.also { it -> //local variable
    // return -> 수신객체(자기자신)
    // }
    //
    val male = User("김태수", 12, true, true)
    val maleValue = male.also {
        user.name
        user.hasGlasses = false
        println(it.name)
    }

    println(maleValue.hasGlasses)

    // 5. with
    // with(수신객체) {
    //
    // ---
    // 마지막 줄
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
}

class User(
    val name : String,
    val age : Int,
    val gender : Boolean, // true : male
    var hasGlasses : Boolean = true
) {

}