fun main() {
    val result = 10 / 2
    println("Result is $result")

    val result2 = 10.0 / 3.0
    println("Result 2 is $result2")

    val result3 = 10.0 / 3
    println("Result 3 is $result3")

    val result4 = 10 / 3.0
    println("Result 4 is $result4")

    val result5 = 10 + 10 / 2
    println("Result 5 is $result5")

    val result6 = (10 + 10) / 2
    println("Result 6 is $result6")

    val result7 = 10 + 10 / 2 * 3
    println("Result 7 is $result7")

    val result8 = (10 + 10) / 2 * 3
    println("Result 8 is $result8")

    val result9 = 10 + (10 / 2) * 3
    println("Result 9 is $result9")

    val result10 = 10 + 10 / (2 * 3)
    println("Result 10 is $result10")

    val result11 = 10 + 10 / 2 + 3
    println("Result 11 is $result11")

    val result12 = 10 + 10 * 2
    println("Result 12 is $result12")


    var a = 10
    a += 10
    println("A is $a")

    a -= 5
    println("A is $a")

    a *= 2
    println("A is $a")

    a++
    println("A is $a")
}