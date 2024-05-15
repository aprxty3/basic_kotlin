package oop.app

import oop.data.Person

fun main(){
    val kotlin = Person()
    kotlin.firstname = "Kotlin"
    kotlin.middleName = "Java"
    kotlin.lastName = "Python"

    println(kotlin.getFullName())

    kotlin.sayHello("Kotlin")

}