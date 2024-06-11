package oop.app

interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
    override fun sayGoodBye(name: String) {
        println("Good Bye $name")
    }
}

class MyDelegationBase(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}

class DelegateBase(val base: Base) : Base by base

fun main() {
    val base = MyBase()
    base.sayHello("Kotlin 1")
    val myBase = MyDelegationBase(base)
    myBase.sayHello("Kotlin 2")

    val delegateBase = DelegateBase(base)
    delegateBase.sayHello("Kotlin 3")
    delegateBase.sayGoodBye("Kotlin 3")
}