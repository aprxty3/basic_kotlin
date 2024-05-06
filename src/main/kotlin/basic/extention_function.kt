fun main() {
    val name = "Kotlin"

    println(name.hello())
    name.printHello()

    "Kotlin".printHello()
}

fun String.hello(): String = "Hello $this"
fun String.printHello(): Unit = println("Hello $this")