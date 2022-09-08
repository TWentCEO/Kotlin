// 클래스의 기본 구조
// 클래스는 '값'과 그 값을 사용하는 '기능'들을 묶어놓은 것

// 고유의 특징값 = 속성 + 기능의 구현 = 함수

fun main(){
    var a = Person("박보영", 1990)
    var b = Person("김태우", 1998)

    a.introduce()
    b.introduce()
}

// 클래스는 '인스턴스'를 만드는 틀
// 인스턴스란? 클래스를 이용해서 만들어내는 서로 다른 속성의 객체를 지칭하는 용어
// ex) A사람 B사람 C사람 각각의 사람이 인스턴스가 됨
class Person(var name:String, val birthYear:Int){
    fun introduce(){
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}