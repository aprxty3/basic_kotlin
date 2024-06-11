package oop.app

typealias App = Application

typealias StringSupplier = () -> String

fun sayHay(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin")
    println(app.name)

    sayHay { "Kotlin" }
}