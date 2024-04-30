fun main() {
    helloWorld()
    sayHello1("Kotlin")
    println(add(10, 20))
    sayHello4()
    sayHello4("World")
    println(add2(10, 20))
    sayHello2("Kotlin", 5)
    sayHello3(null)
    sayHello3("Kotlin")
    fullName(lastName = "Kotlin", firstName = "Jetbrains")
}

fun helloWorld() {
    println("Hello World")
}

//function with parameter
fun sayHello1(name: String) {
    println("Hello $name")
}

//function with multiple parameter
fun sayHello2(name: String, age: Int) {
    println("Hello $name, you are $age years old")
}

//function with nullable parameter
fun sayHello3(name: String?) {
    if (name != null) {
        println("Hello $name")
    } else {
        println("Hello")
    }
}

//function with return value
fun add(a: Int, b: Int): Int {
    return a + b
}

//function with default parameter
fun sayHello4(name: String = "Kotlin") {
    println("Hello $name")
}

//function with single expression
fun add2(a: Int, b: Int): Int = a + b

//function fullName
fun fullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}
