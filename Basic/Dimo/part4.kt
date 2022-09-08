// 흐름제어와 

/*
return = 함수를 종료하고 값을 반환
break = 반복문 내의 구문이 실행되는 중간에 즉시 반복문을 종료하고 다음 구문으로 넘어감
continue = 다음 반복 조건으로 넘어감
*/ 

fun main() {
    /*
    for(i in 1..10){
        if(i == 3) break
        print(i)
    }
    */ // 123
    /*
    for(i in 1..10){
        if(i == 3) continue
        print(i)
    }
    */ // 1245678910

    /*
    loop@for(i in 1..10){
        for(j in 1..10){
            if(i==1 && j ==2) break@loop
        }
    }
    */ // 1245678910    
}
