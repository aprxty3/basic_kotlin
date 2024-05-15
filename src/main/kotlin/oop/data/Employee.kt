package oop.data

open class Employee(val name: String) {
    fun sayHello(name: String) {
        println("Hello $name, My Name are ${this.name} ")
    }
}

class Manager(name: String) : Employee(name)