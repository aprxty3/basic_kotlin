package oop.app

import oop.data.Address
import oop.data.Car
import oop.data.Person

fun main() {
    val person = Person()
    val address = Address()

    println(address)
    println(person)

    person.firstname = "A"
    person.middleName = "J"
    person.lastName = "I"

    println(person.firstname)
    println(person.middleName)
    println(person.lastName)


}