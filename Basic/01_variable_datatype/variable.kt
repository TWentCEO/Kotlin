/*  
ClassName 은 파스칼 표기법 : 모든 단어를 대문자로 시작 ex) ClassName
function, variableName은 카멜 표기법 : 첫 단어만 소문자로 시작 ex) functionName
*/ 

/*
변수의 선언

val : 선언시에만 초기화 가능 중간에 값을 변경할 수 없음

var : 일반적으로 툥용되는 변수 언제든지 읽기 쓰기가 가능

runtime시 변경되지 말아야 할 값은 val로 선언하는 것이 안전함.
 */


 /*
 변수의 선언 위치에 따른 이름

Property(속성) Class에 선언된 변수
 
Local Variable(지역변수) Class 이 외의 Scope 내에 선언된 변수
 
  */


/*
코틀린은 고전 언어들과 다르게

변수가 선언이 되고 값이 할당되지 않으면 null값을 허용하지 않아

문법 에러를 표시하고 컴파일 자체를 막아줌으로써 

null pointer exception 등을 방지해줌
 */

fun main(
    var integer : Int = 123

    println(integer)
)