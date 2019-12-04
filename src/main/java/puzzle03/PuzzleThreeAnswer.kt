package puzzle03

import java.io.File
import kotlin.Exception
import kotlin.math.absoluteValue

class PuzzleThreeAnswer {
    private val fileBuffer = File("src/main/java/puzzle03/input.txt").bufferedReader()
    private val wireOne = fileBuffer.readLine()
    private val wireTwo = fileBuffer.readLine()

    fun answer1(): Int {
        return calculateShortestManhattanDistance(wireOne, wireTwo)
    }

    fun answer2(): Int {
        return calculateLeastSteps(wireOne, wireTwo)
    }

    fun calculateLeastSteps(wireOne: String, wireTwo: String): Int {
        val wireOnePoints = convertDirectionsToPoints(wireOne.split(","))
        val wireTwoPoints = convertDirectionsToPoints(wireTwo.split(","))
        val intersections = wireOnePoints.intersect(wireTwoPoints).drop(1)

        val steps = ArrayList<Int>()

        intersections.forEach {
            steps.add(wireOnePoints.indexOf(it) + wireTwoPoints.indexOf(it))
        }

        return steps.min()!!
    }

    fun calculateShortestManhattanDistance(wireOne: String, wireTwo: String): Int {
        val wireOnePoints = convertDirectionsToPoints(wireOne.split(","))
        val wireTwoPoints = convertDirectionsToPoints(wireTwo.split(","))
        val intersections = wireOnePoints.intersect(wireTwoPoints).drop(1)

        var shortestDistance = intersections.elementAt(0).x.absoluteValue + intersections.elementAt(0).y.absoluteValue

        for (i in 1 until intersections.size) {
            val intersection = intersections.elementAt(i)
            val currentDistance = intersection.x.absoluteValue + intersection.y.absoluteValue

            if (currentDistance < shortestDistance) shortestDistance = currentDistance
        } // for

        return shortestDistance
    }

    private fun convertDirectionsToPoints(directions: List<String>): List<Point> {
        val points = ArrayList<Point>()

        points.add(Point(0, 0))

        directions.forEach {
            val direction = it[0]
            var magnitude = it.drop(1).toInt()

            while (magnitude > 0) {
                val prevPoint = points.last()

                when (direction) {
                    'U' -> points.add(Point(prevPoint.x, prevPoint.y + 1))
                    'R' -> points.add(Point(prevPoint.x + 1, prevPoint.y))
                    'D' -> points.add(Point(prevPoint.x, prevPoint.y - 1))
                    'L' -> points.add(Point(prevPoint.x - 1, prevPoint.y))
                    else -> throw Exception("Not a valid direction")
                }

                --magnitude
            }
        }

        return points.toList()
    } // convertDirectionsToPoints

    data class Point(val x: Int, val y: Int)

} // PuzzleThreeAnswer