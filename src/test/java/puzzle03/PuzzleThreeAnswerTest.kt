package puzzle03

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.amshove.kluent.*

class PuzzleThreeAnswerTest : Spek({
    describe("Puzzle Three Answers") {
        val puzzleThreeAnswer = PuzzleThreeAnswer()

        describe("Part One Example") {
            it("Should return the example answers") {
                val wireOneSet = ArrayList<String>()
                val wireTwoSet = ArrayList<String>()
                val answerSet = ArrayList<Int>()

                wireOneSet.add("R8,U5,L5,D3")
                wireTwoSet.add("U7,R6,D4,L4")
                answerSet.add(6)

                wireOneSet.add("R75,D30,R83,U83,L12,D49,R71,U7,L72")
                wireTwoSet.add("U62,R66,U55,R34,D71,R55,D58,R83")
                answerSet.add(159)

                wireOneSet.add("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51")
                wireTwoSet.add("U98,R91,D20,R16,D67,R40,U7,R15,U6,R7")
                answerSet.add(135)

                for (i in answerSet.indices) {
                    val result = puzzleThreeAnswer.calculateShortestManhattanDistance(wireOneSet[i], wireTwoSet[i])
                    val expected = answerSet[i]

                    result shouldEqual expected
                }
            }
        }

    }

})