fun main() {
    val a = 10
    val b = 20
    val max = if (a > b) {
        println("a is larger than b.")
        a
    } else {
        println("b is larger than a.")
        b
    }
    println("max is $max")

    val x = 10
    val y = 20
    val max1 = if (x > y) x else y
    println("max1 is $max1")

    val max2 = if (x > y) {
        x
    } else {
        y
    }
    println("max2 is $max2")

    val max3 = if (x > y) x else if (x < y) y else x
    println("max3 is $max3")
}