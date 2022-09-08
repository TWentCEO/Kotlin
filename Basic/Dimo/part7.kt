// 오버라이딩과 추상화

fun main(){

    var d = Dog()

    d.eat()
    d.run()
}

// 오버라이딩
// open class Animal{
//     open fun eat(){
//         println("음식을 먹습니다.")
//     }
// }

// class Tiger : Animal(){
    
//     override fun eat(){
//         println("고기를 먹습니다.")
//     }

// }

// 추상화(abstraction)

// 추상함수, 추상클래스

// abstract class Animal {
//     abstract fun eat()
//     fun sniff(){
//         println("킁킁")
//     }
// }

// class Rabbit : Animal(){
//     override fun eat(){
//         println("당근을 먹습니다.")
//     }
// }

// 인터페이스
// 추상함수로만 이루어져있는 '순수 추상화 기능'을 말하는 것
// 인터페이스는 생성자를 가질 수는 없으며
// 구현부가 있는 함수 -> Open
// 구현부가 없는 함수 -> abstract

interface Runner {
    fun run()
}

interface Eater {
    fun eat(){
        println("음식을 먹습니다.")
    }
}

class Dog : Runner, Eater{
    override fun run(){
        println("우다다다 뜁니다.")
    }

    override fun eat(){
        println("허겁지겁 먹습니다.")
    }
}

// 주의할 점
// 여러개의 인터페이스나 클래스에서 같은 이름이나 형태를 구현하고 있다면
// 서브클래스에서는 혼선이 없게 오버라이딩을 해야함.