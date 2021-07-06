package subtask3

//import sun.security.ec.point.ProjectivePoint

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var charArray = number.toCharArray()
        var stringArray = arrayOf<String>()
        charArray.forEachIndexed { index, char ->
            charArray = number.toCharArray()
            if (char in '0'..'9') {
                arrayOfNeighbours[char.toString().toInt()].forEach {
                    charArray[index] = it
                    stringArray += arrayOf(charArray.joinToString(""))
                }
            } else return null
        }
        return stringArray
    }
}

val arrayOfNeighbours = arrayOf(
    charArrayOf('8'),
    charArrayOf('2', '4'),
    charArrayOf('1', '3', '5'),
    charArrayOf('2', '6'),
    charArrayOf('1', '5', '7'),
    charArrayOf('2', '4', '6', '8'),
    charArrayOf('3', '5', '9'),
    charArrayOf('4', '8'),
    charArrayOf('0', '5', '7', '9'),
    charArrayOf('6', '8')
)
