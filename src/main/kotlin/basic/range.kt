fun main() {
    val range1 = 1..100
    val range2 = 1 until 100
    val range3 = 100 downTo 1

    println(range1)
    println(range2)
    println(range3)

    println(range1.count())
    println(range1.contains(20))
    println(range1.contains(200))
    println(range1.first)
    println(range1.last)
    println(range1.step)

    val range4 = 100 downTo 1 step 5
    println(range4)
    println(range4.count())
    println(range4.contains(20))
    println(range4.contains(200))
    println(range4.first)
    println(range4.last)
    println(range4.step)

}