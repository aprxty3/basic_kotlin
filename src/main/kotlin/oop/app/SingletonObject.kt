package oop.app

object Utilities {

    var name = "Utilities Object"
    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

class Application(val name: String) {
    object Utilities {
        fun toUpper(value: String): String {
            return value.uppercase()
        }
    }
}

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("kotlin"))

    println(Application.Utilities.toUpper("kotlin"))
}