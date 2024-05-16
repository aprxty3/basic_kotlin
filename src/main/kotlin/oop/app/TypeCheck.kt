package oop.app


fun printObject(any: Any) {
    when (any) {
        is Laptop ->
            println("Laptop ${any.name}")

        is Merek ->
            println("Merek ${any.name}")

        is String -> println("String ${any}")
        else ->
            println(any)
    }

}

class Merek(val name: String)

class Laptop(val name: String)


fun main() {
    printObject("Kotlin")
    printObject(1000)
    printObject(Laptop("Asus"))
    printObject(Merek("Asus"))

}