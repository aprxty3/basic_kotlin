const val APP_NAME = "Kotlin App"
const val APP_VERSION = "1.0.0"
fun main() {
    val name: String = "John"
//    name = "Doe"

    var name1 = "John"
    name1 = "Doe"

    println(name1)

    var firstName: String? = "John"
    firstName = null
    println(firstName)
    println(firstName?.length)

    println("$APP_NAME Version $APP_VERSION")
}