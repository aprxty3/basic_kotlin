fun main() {

    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    val lambdaUpper = { value: String -> value.uppercase() }

    println(hello("Kotlin", lambdaUpper))

    println(hello("KOTLIN", { value: String -> value.lowercase() }))

    println(hello("Kotlin") { it.uppercase() })


}
