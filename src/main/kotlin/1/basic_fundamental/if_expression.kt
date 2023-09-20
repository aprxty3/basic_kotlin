package `1`.basic_fundamental

fun main() {
    val openHour = 7
    val now = 7
    val office: String

    office = if (now > 7) {
        "Office already open"
    } else if (now == openHour) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office)
}