package subtask2

import java.lang.Math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        var resArray: Array<Int> = arrayOf()
        var numberForArray: Long = number - 1L
        while (true){
            if ((numberForArray * numberForArray + resArray.countSqr()) <= number.toLong() * number.toLong() ) {
                if (numberForArray >= 1L) resArray += arrayOf(numberForArray.toInt())
            }
            if (numberForArray <= 1L){
                if (resArray.countSqr() == (number.toLong() * number.toLong())) {
                    return resArray.reversedArray()
                }
                if (resArray.lastIndex <= 0)
                    return null
                var position = resArray.lastIndex-1
                while (position > 0 && resArray[position+1] == resArray[position]-1){
                    position--
                }
                numberForArray = resArray[position].toLong()
                resArray =
                    if (position != 0)
                        resArray.sliceArray(0 until position)
                    else
                        arrayOf()
            }
            val nextNumber = sqrt((number.toLong() * number.toLong() - resArray.countSqr()).toDouble()).toLong()
            if (numberForArray > nextNumber ) {
                numberForArray =
                    if (nextNumber < resArray[resArray.lastIndex].toLong())
                        nextNumber
                    else
                        resArray[resArray.lastIndex].toLong() - 1L
            } else {
                numberForArray--
            }
        }
    }

    private fun Array<Int>.countSqr(): Long{
        var count = 0L
        if (this.isEmpty())
            return 0L
        this.forEach {
            count += it.toLong() * it.toLong()
        }
        return count
    }
}
