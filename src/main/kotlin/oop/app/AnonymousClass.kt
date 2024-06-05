package oop.app

interface Action {
    fun action()
}

fun fireAction(action: Action) {
    action.action()
}

fun main() {
    fireAction(object : Action {
        override fun action() {
            println("Fire!")
        }
    })
    fireAction(object : Action {
        override fun action() {
            println("Fire! Fire! Fire!")
        }
    })
}