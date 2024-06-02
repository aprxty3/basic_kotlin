package oop.data

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface  Go {
    fun got(){
        println("Go")
    }
}

interface  Lari : Interaction {
    fun lari(){
        println("$name is running")
    }
}

open class Begitula (){}

class Human(override val name: String) : Interaction, Go, Begitula() {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

class Manusya(override val name: String) : Lari {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}