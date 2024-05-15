package oop.data

class Person {
    var firstname: String = ""
    var middleName: String? = null
    var lastName: String = ""


    fun sayHello(name: String) {
        println("Hello $name, My Name are $firstname ")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstname $middleName $lastName"
    }
}