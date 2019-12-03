package puzzleTwo

import java.io.File
import java.lang.Exception

class PuzzleTwoAnswer {
    private val gravityAssistProgram = ArrayList<Int>()

    init {
        @Suppress("NAME_SHADOWING")
        File("src/main/java/puzzleTwo/input.txt").forEachLine { it.split(",").map { gravityAssistProgram.add(it.toInt()) } }
    }

    fun answer2(): Int {
        val inputRange = 0..99

        var noun = 0
        var verb = 0

        val requiredOutput = 19690720

        i@for (i in inputRange) {
            j@for (j in inputRange) {
                if (answer2Helper(i, j) == requiredOutput) {
                    noun = i
                    verb = j

                    break@i
                }
            }
        }

        return 100 * noun + verb
    }

    fun answer2Helper(noun: Int, verb: Int): Int {
        val gravAssistProg = gravityAssistProgram.toIntArray()
        gravAssistProg[1] = noun
        gravAssistProg[2] = verb

        return processIntcodeProgram(gravAssistProg)[0]
    }

    fun answer1(): Int {
        val gravAssistProg = gravityAssistProgram.toIntArray()
        gravAssistProg[1] = 12
        gravAssistProg[2] = 2

        return processIntcodeProgram(gravAssistProg)[0]
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