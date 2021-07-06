package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for(i in 1..array[0]){
            if (getMeCombinations(array[1], i) >= array[0])
                return i
        }
        return null
    }

    private fun getMeCombinations(n: Int, m: Int): Int =
        ( n.fact() / ( (n-m).fact() * m.fact() ) ).toInt()
}
//  !6 / ( !2 * !4) =

fun Int.fact(): Long {
    var res = 1L
    for (i in 1..this){
        res *= i
    }
    return res
}
