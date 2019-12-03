import Util.DisplayFormatter
import puzzleOne.PuzzleOneAnswer

fun main() {
    val puzzleOneAnswer = PuzzleOneAnswer()

    DisplayFormatter.title("Puzzle One")
    DisplayFormatter.subTitle("Part One")
    DisplayFormatter.answer(puzzleOneAnswer.answer1())
    DisplayFormatter.subTitle("Part Two")
    DisplayFormatter.answer(puzzleOneAnswer.answer2())



} // main