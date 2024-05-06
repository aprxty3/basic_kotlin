fun main() {
    val hell = fun(name: String): String {
        return if (name.isEmpty()) {
            "Hell"
        } else {
            name.uppercase()
        }
    }

    println(hell(""))
    println(hell("Kotlin"))

    fun hello(value: String, tranformer: (String) -> String): String {
        return "Hello ${tranformer(value)}"
    }


    println(hello("Kotlin", hell))

}