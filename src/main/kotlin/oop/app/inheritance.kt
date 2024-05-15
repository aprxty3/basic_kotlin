package oop.app

import oop.data.Employee
import oop.data.Manager

fun main() {
    val manager = Manager("Kotlin")

    manager.sayHello("Hai")

    val employ = Employee("Kotlin")

    employ.sayHello("Hai")
}