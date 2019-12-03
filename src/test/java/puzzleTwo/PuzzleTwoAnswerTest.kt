package puzzleTwo

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.amshove.kluent.*
import kotlin.math.exp

class PuzzleTwoAnswerTest : Spek({
    describe("Puzzle Two Answers") {
        val puzzleTwoAnswer = PuzzleTwoAnswer()

        describe("Part One Example") {
            it("Should return the example answers") {
                val exampleInputs = ArrayList<IntArray>()
                val exampleAnswers = ArrayList<IntArray>()

                exampleInputs.add(intArrayOf(1,9,10,3,2,3,11,0,99,30,40,50))
                exampleAnswers.add(intArrayOf(3500,9,10,70, 2,3,11,0, 99, 30,40,50))

                exampleInputs.add(intArrayOf(1,0,0,0,99))
                exampleAnswers.add(intArrayOf(2,0,0,0,99))

                exampleInputs.add(intArrayOf(2,3,0,3,99))
                exampleAnswers.add(intArrayOf(2,3,0,6,99))

                exampleInputs.add(intArrayOf(2,4,4,5,99,0))
                exampleAnswers.add(intArrayOf(2,4,4,5,99,9801))

                exampleInputs.add(intArrayOf(1,1,1,4,99,5,6,0,99))
                exampleAnswers.add(intArrayOf(30,1,1,4,2,5,6,0,99))

                for (i in exampleInputs.indices) {
                    val result = puzzleTwoAnswer.processIntcodeProgram(exampleInputs[i])
                    val expected = exampleAnswers[i]

                    result shouldEqual expected
                }
            }
        }

        describe("Part Two Example") {
            it("Should return the example answer") {
                val noun = 12
                val verb = 2

                val result = 100 * noun + verb
                val expected = 1202

                result shouldEqualTo expected
            }
        }

    }
})