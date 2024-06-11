package oop.app

class Lazy {
    val name: String by lazy {
        println("Lazy properties accessed!")
        "Aji"
    }
}

fun main(){
    val lazy = Lazy()
    println("Name is ${lazy.name}")
    println("Name is ${lazy.name}")
}