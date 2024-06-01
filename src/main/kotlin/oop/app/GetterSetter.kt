package oop.app

fun main(){
    val note = Note("Belajar Kotlin")
    println(note.title)
    note.title = "Belajar Kotlin OOP"
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.bigTitle)
    println(bigNote.title)
}

class Note (title : String){
    var title : String = title
        get() {
            println("Call getter function")
            return field
        }
        set(value) {
            println("Call setter function")
            field = value
        }
}

class BigNote(val title: String){
    val bigTitle : String
        get() = title.uppercase()
}