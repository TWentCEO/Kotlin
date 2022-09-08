fun main(){
    doFor()
}
// 조건형 반복문
fun While(){
    var a = 0

    while(a < 5){
        println(a++)
    }
}

// do..while = 조건에 상관없이 한번은 실행시켜야 한다면 doWhile
fun doWhile(){
    var a = 0

    do{
        println(a++)
    }while(a < 5)
}

// 범위형 반복문 = for
fun doFor(){
    
    for(i in 0..9){
        println(i)
    }

    for(i in 0..9 step 3){
        println(i)
    }

    for(i in 9 downTo 0){
        println(i)
    }

    for(i in 'a'..'e'){
        println(i)
    }

}