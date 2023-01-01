package com.twent.part0.kotlin.ch02

/*
    Ch.05 Data, Sealed class

    Data class: 데이터를 담기 위한 클래스
        * toString(), hashCode(), equals(), copy() 메서드를 자동으로 생성
            * override 하면, 직접 구현한 코드를 사용
        * 1개 이상의 프로퍼티가 있어야 함
        * 데이터 클래스는 abstract, open, sealed, inner 를 붙일 수 없음
        * 상속이 불가
    Sealed class : 추상 클래스로, 상속받은 자식 클래스의 종류를 제한
        * 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 암
        * when 과 함께 쓰일 때, 장점을 느낄 수 있음
 */

fun main() {
    val person = Person("김태우", 24)
    val poppy = Dog("해피", 3)

    println(person.toString())
    println(poppy.toString())

    val cat: Cat = BlueCat()

    val result = when(cat) {
        is BlueCat -> "blue"
        is BlackCat -> "black"
        is RedCat -> "red"
        is WhiteCat -> "white"
    }
}

class Person(
    val name: String,
    val age: Int,
)

data class Dog(
    val name: String,
    val age: Int,
)

sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class BlackCat : Cat()
class WhiteCat : Cat()