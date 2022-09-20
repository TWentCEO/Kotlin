// 자연수 뒤집어서 배열 만들기

class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        answer = n.toString().reversed().map{it.toString().toInt()}.toIntArray()
        return answer
    }
}