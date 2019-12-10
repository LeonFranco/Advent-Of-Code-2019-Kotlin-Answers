package puzzle04

class PuzzleFourAnswer {
    private val input = 206938..679128

    fun answer1(): Int {
        var count = 0

        for (n in input) {
            if (isPotentialPassword(n)) count++
        }

        return count
    }

    fun answer2(): Int {
        var count = 0

        for (n in input) {
            if (isPotentialPassword2(n)) count++
        }

        return count
    }

    fun isPotentialPassword2(num: Int) = hasNonDecreasingNumbers(num) && hasOnlyDoubleNumber(num)

    private fun hasOnlyDoubleNumber(num: Int): Boolean {
        val numStr = num.toString()
        val numCounter = HashMap<Char, Int>()

        for (digitChar in numStr) {
            if (numCounter.containsKey(digitChar)) {
                numCounter[digitChar] = numCounter[digitChar]!!.inc()
            }
            else {
                numCounter[digitChar] = 1
            }
        }

        var result = false

        for (value in numCounter.values) {
            if (value == 2) {
                result = true
                break
            }
        }

        return result
    }

    fun isPotentialPassword(num: Int) = hasSameAdjacentNumber(num) && hasNonDecreasingNumbers(num)

    private fun hasSameAdjacentNumber(num: Int): Boolean {
        var result = false

        val numStr = num.toString()

        for (i in 1..numStr.lastIndex) {
            if (numStr[i - 1] == numStr[i]) {
                result = true
                break
            }
        }

        return result
    } // hasSameAdjacentNumber

    private fun hasNonDecreasingNumbers(num: Int): Boolean {
        var result = true

        val numStr = num.toString()

        for (i in 1..numStr.lastIndex) {
            if (numStr[i - 1] > numStr[i]) {
                result = false
                break
            }
        }

        return result
    } // hasNonDecreasingNumbers

} // PuzzleFourAnswer