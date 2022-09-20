//정수 제곱근 판별법
import kotlin.math.*
class Programmers1 {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var sqrt : Double = sqrt(n.toDouble())
        if (sqrt%1 == 0.0) answer=(sqrt+1).pow(2).toLong()
        else answer = -1
        return answer
    }
}