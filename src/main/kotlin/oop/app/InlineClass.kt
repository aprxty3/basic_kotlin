inline class Token(val value: String) {
    fun toUpper(): String {
        return value.uppercase()
    }
}

fun main() {
    val token = Token("kotlin")

    println(token.value)
    println(token.toUpper())
}