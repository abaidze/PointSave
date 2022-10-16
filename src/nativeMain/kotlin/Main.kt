import  Point
import kotlin.test.assertTrue

fun main() {
    val point1=Point("1","2")
    println(point1.toString())
    val point2=Point("1","2")

    assertTrue(point1==point2)
}