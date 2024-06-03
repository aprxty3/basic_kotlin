package oop.app

sealed class Operation(val name: String)

class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Multiply : Operation("Multiply")

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Multiply -> value1 * value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 10, Minus()))
    println(operation(10, 10, Multiply()))
}