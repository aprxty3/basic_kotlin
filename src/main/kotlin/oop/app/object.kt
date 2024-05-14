package oop.app

import oop.data.Address
import oop.data.Car
import oop.data.Person

fun main() {
    val person = Person()
    val address = Address()
    val car = Car()

    println(address)
    println(person)
    println(car)

    person.firstname = "A"
    person.middleName = "J"
    person.lastName = "I"

    println(person.firstname)
}