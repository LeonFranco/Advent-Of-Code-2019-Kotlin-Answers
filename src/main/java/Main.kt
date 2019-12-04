import Util.DisplayFormatter
import puzzle01.PuzzleOneAnswer
import puzzle02.PuzzleTwoAnswer
import puzzle03.PuzzleThreeAnswer

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


    val puzzleThreeAnswer = PuzzleThreeAnswer()

    DisplayFormatter.title("Puzzle Three")
    DisplayFormatter.subTitle("Part One")
    DisplayFormatter.answer(puzzleThreeAnswer.answer1())
} // main