package oop.data

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My Name are ${this.name} ")
    }
}

class Manager(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My Name are Manager ${this.name} ")
    }
}