infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    val name = "Kotlin"
    println(name to "UP")
    println(name to "LOW")
}