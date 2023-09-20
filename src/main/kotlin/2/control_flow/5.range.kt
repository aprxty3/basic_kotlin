fun main() {
    val rangeInt = 1..10 step 2
    println(rangeInt.step)

    rangeInt.forEach {
        print("$it ")
    }
    println()
    println(rangeInt.step)

    val oneTen = 1.rangeTo(10)
    val tenOne = 10.downTo(1)

    oneTen.forEach(::print)
    println()
    tenOne.forEach(::print)
    println()
    if (7 in tenOne) {
        println("Value 7 available")
    }
}