fun main(){
    
}

/*
<, <=, >, >=, !=, ==

자료형 확인 연산자 ex)a is Int
!is 연산자
 */

//다중 조건문
// Any자료형 코틀린 최상위 자료형 어떤 자료형이 와도 상관 X
// 등호나 부등 사용 불가능
// 여러개의 조건이 만족되면 먼저 만족되는 것을 보여줌
 fun doWhen(a: Any){
    when(a){
        1 -> println("정수1")
        "DiMO" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long타입")
        !is String -> println("String아님")
        else -> println("어떤 조건도 만족 못함")
    }
 }
 // When을 활용한 expression
fun expressionWhen(a:Any){
    var result = when(a){
        1 -> println("정수1")
        "DiMO" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long타입")
        !is String -> println("String아님")
        else -> println("어떤 조건도 만족 못함")
    }

}
 // if조건문
fun doIf(){
    var a = 11

    if(a > 10){
        println(a)
    }else{
        println(a)
    }
 }

