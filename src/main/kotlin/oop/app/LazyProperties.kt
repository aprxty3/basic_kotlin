package oop.app

import kotlin.properties.Delegates

class Lazy(description: String = "") {
    val name: String by lazy {
        println("Lazy properties accessed!")
        "Aji"
    }

    var observe: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    }


}

fun main() {
    val lazy = Lazy()
    println("Name is ${lazy.name}")
    println("Name is ${lazy.name}")


    lazy.observe = "New Description"
    lazy.observe = "Another Description"

}