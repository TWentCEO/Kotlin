class Solution {
    fun solution(x: Int, n: Int): LongArray{
        var answer = LongArray(n){
            x.toLong() * (it + 1)
        }
        return answer
    }
}