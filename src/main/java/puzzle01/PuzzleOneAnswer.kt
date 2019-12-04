package puzzle01

import java.io.File
import kotlin.math.floor

class PuzzleOneAnswer {
    private val moduleMasses = ArrayList<Int>()

    init {
        File("src/main/java/puzzle01/input.txt").forEachLine { moduleMasses.add(it.toInt()) }
    }

    fun answer1(): Int {
        return moduleMasses.fold(0) { sum, moduleMass ->
            sum + calculateFuelMass(moduleMass)
        }
    } // answer1

    fun answer2(): Int {
        return moduleMasses.fold(0) { sum, moduleMass ->
            sum + calculateFuelMass2(moduleMass)
        }
    } // answer2

    fun calculateFuelMass(moduleMass: Int): Int {
        return floor(moduleMass / 3.0).toInt() - 2
    } // calculateFuelMass

    fun calculateFuelMass2(moduleMass: Int): Int {
        var total = 0
        var current = calculateFuelMass(moduleMass)

        while (current > 0) {
            total += current
            current = calculateFuelMass(current)
        } // while

        return total
    } // calculateFuelMass

} // PuzzleOneAnswer