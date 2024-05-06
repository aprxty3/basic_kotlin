fun main() {
    val sayHello = { nama: String -> println("Hello $nama") }
    sayHello("Kotlin")
    sayHello("World")

    val hello: (String, String) -> String = { firstName: String, lastName: String -> "$firstName $lastName" }

    println(hello("Jetbrains", "Kotlin"))
}