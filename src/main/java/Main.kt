import Util.DisplayFormatter
import puzzle01.PuzzleOneAnswer
import puzzle02.PuzzleTwoAnswer

fun main() {
    val puzzleOneAnswer = PuzzleOneAnswer()

    DisplayFormatter.title("Puzzle One")
    DisplayFormatter.subTitle("Part One")
    DisplayFormatter.answer(puzzleOneAnswer.answer1())
    DisplayFormatter.subTitle("Part Two")
    DisplayFormatter.answer(puzzleOneAnswer.answer2())


    val puzzleTwoAnswer = PuzzleTwoAnswer()

    DisplayFormatter.title("Puzzle Two")
    DisplayFormatter.subTitle("Part One")
    DisplayFormatter.answer(puzzleTwoAnswer.answer1())
    DisplayFormatter.subTitle("Part Two")
    DisplayFormatter.answer(puzzleTwoAnswer.answer2())
} // main