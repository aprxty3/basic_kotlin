fun main() {
    val ranges = 1..5
    for (i in ranges) {
        println("value is $i!")
    }

    val ranges2 = 1.rangeTo(20) step 4

    for ((index, value) in ranges2.withIndex()) {
        println("value $value with index $index")
    }


    val ranges3 = 1.rangeTo(10) step 3
    ranges3.forEach { value ->
        println("value is $value!")
    }

    ranges3.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}