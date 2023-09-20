fun main() {
    val openHour = 7
    val now = 8
    if (now > openHour) println("Office already open") else println("Office is closed")

    val office = if (now > openHour) "Office already open" else "Office is closed"
    println(office)


    println(sum(2, 4 * 8))

    val value1 = 10
    val value2 = 20
    println(sum(value1, value2))


}

fun sum(value1: Int, value2: Int) = value1 + value2