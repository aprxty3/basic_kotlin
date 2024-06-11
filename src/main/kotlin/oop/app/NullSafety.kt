package oop.app

data class Friend(val name: String, val age: Int)

fun sayHello(friend: Friend?) {
    val name = friend?.name ?: "Friend"
    println("Hello $name")
}

fun main() {
    sayHello(Friend("Aji", 20))

}