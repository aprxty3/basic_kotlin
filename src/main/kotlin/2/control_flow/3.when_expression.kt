import kotlin.random.Random

fun main() {
    val value = 7

    val stringValue = when (value) {
        6 -> " value is $value / 6"
        7 -> " value is $value / 7"
        8 -> " value is $value / 8"
        9 -> " value is $value / 9"
        else -> " value cannot be reached"
    }

    println(stringValue)

    val stringValue2 = when (value) {
        6 -> {
            println("Six")
            " value is $value / 6"
        }

        7 -> {
            println("Seven")
            " value is $value / 7"
        }

        8 -> {
            println("Eight")
            " value is $value / 8"
        }

        9 -> {
            println("Nine")
            " value is $value / 9"
        }

        else -> " value cannot be reached"
    }

    println(stringValue2)

    val anyType: Any = 10L
    when (anyType) {
        is Long -> println("The value has a Long type")
        is String -> println("The value has a String type")
        else -> println("Undefined")
    }

    val value2 = 27
    val ranges = 10..50

    when (value2) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    val registerNumber = when (val regis = getRegisterNumber()) {
        in 1..50 -> regis
        in 51..100 -> regis
        else -> regis
    }
    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)