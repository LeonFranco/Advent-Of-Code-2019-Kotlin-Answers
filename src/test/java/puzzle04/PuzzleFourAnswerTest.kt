package puzzle04

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.amshove.kluent.*

class PuzzleFourAnswerTest : Spek({
    describe("Puzzle Four Answers") {
        val puzzleFourAnswer = PuzzleFourAnswer()

        describe("Part One Example") {
            it("Should return the example answers") {
                val exampleInputs = ArrayList<Int>()
                val exampleAnswers = ArrayList<Boolean>()

                exampleInputs.add(111111)
                exampleAnswers.add(true)

                exampleInputs.add(223450)
                exampleAnswers.add(false)

                exampleInputs.add(123789)
                exampleAnswers.add(false)

                for (i in exampleInputs.indices) {
                    val result = puzzleFourAnswer.isPotentialPassword(exampleInputs[i])
                    val expected = exampleAnswers[i]

                    result shouldEqual expected
                }
            }
        }
    }

})