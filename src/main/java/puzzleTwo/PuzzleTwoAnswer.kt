package puzzleTwo

import java.io.File
import java.lang.Exception

class PuzzleTwoAnswer {
    private val gravityAssistProgram = ArrayList<Int>()

    init {
        @Suppress("NAME_SHADOWING")
        File("src/main/java/puzzleTwo/input.txt").forEachLine { it.split(",").map { gravityAssistProgram.add(it.toInt()) } }
    }

    fun answer1(): Int {
        val processed = processIntcodeProgram(gravityAssistProgram.toIntArray())
        return processed[0]
    }

    fun processIntcodeProgram(program: IntArray): IntArray {
        val result = program.clone()

        for (i in program.indices step 4) {
            val oppcode = result[i]

            if (oppcode == 99) break

            val indexOfInput1 = result[i + 1]
            val indexOfInput2 = result[i + 2]
            val indexOfOutput = result[i + 3]

            when (oppcode) {
                1 -> result[indexOfOutput] = result[indexOfInput1] + result[indexOfInput2]
                2 -> result[indexOfOutput] = result[indexOfInput1] * result[indexOfInput2]
                else -> throw Exception("Unknown Opcode")
            }
        }

        return result
    } // processIntcodeProgram


} // PuzzleTwoAnswer