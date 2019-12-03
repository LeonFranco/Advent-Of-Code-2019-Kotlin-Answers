package puzzleOne

import org.spekframework.spek2.Spek
import org.amshove.kluent.*
import org.spekframework.spek2.style.specification.describe

class PuzzleOneAnswerTest : Spek({
    describe("Puzzle One Answers") {
        val puzzleOneAnswer = PuzzleOneAnswer()

        describe("Part One Examples") {
            it("Should return the example answers") {
                val exampleInputs = intArrayOf(12, 14, 1969, 100756)
                val exampleAnswers = intArrayOf(2, 2, 654, 33583)

                for (i in exampleInputs.indices) {
                    val result = puzzleOneAnswer.calculateFuelMass(exampleInputs[i])
                    val expected = exampleAnswers[i]

                    result shouldEqualTo expected
                }
            }
        }

        describe("Part Two Examples") {
            it("Should return the example answers") {
                val exampleInputs = intArrayOf(14, 1969, 100756)
                val exampleAnswers = intArrayOf(2, 966, 50346)

                for (i in exampleInputs.indices) {
                    val result = puzzleOneAnswer.calculateFuelMass2(exampleInputs[i])
                    val expected = exampleAnswers[i]

                    result shouldEqualTo expected
                }
            }
        }
    }
})