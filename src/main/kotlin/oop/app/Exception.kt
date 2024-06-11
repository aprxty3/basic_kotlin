package oop.app

class ValidationException(message: String) : Throwable(message)

fun validate(value: String) {
    if (value.isBlank()) {
        throw ValidationException("Value is blank")
    }
    println("Value is $value")
}

fun main(){
    try {
        validate("Kotlin")
        validate("")
    } catch (e: ValidationException) {
        println("Validation Error: ${e.message}")
    }
}