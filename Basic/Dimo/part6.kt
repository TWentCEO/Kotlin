// 클래스의 생성자
// 생성자란? 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
// 생성자의 기능 인스턴스의 속성을 초기화, 인스턴스 생성시 구문을 수행

// init 함수 생성자를 통해 인스턴스가 만들어질때 호출되는 함수
fun main(){
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("장원영", 2004)

    var d = Person("이루다")
    var e = Person("차은우")
}

class Person (var name: String, val birthYear:Int){
    init{
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }   
    constructor(name:String) : this(name,1997){
        println("보조 생성자가 사용되었습니다.")
    }
}
// 보조생성자란? 기본생성자랑 다른형태의 생성자를 제공하여 인스턴시 생성시 편의를 제공하거나 추가적인 구문을 수행하기는 기능을 제공

