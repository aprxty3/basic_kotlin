package oop.app

class Students(val name: String, val age: Int)

// this is the extension function
fun Students.speak() {
    println("Hello my name is $name, I'm $age years old")
}

fun Students?.introduce(name: String) {
    if (this != null) {
        println("Hello $name my name is ${this.name}, I'm ${this.age} years old")
    }
}

val Students.hobby: String
    get() = "Watching movie"

val Students.upperName: String
    get() = name.uppercase()

fun main() {
    val student = Students("Budi", 20)
    student.speak()

    val student2 = Students("Eko", 22)
    student2.introduce("Joko")

    println(student.hobby)
    println(student.upperName)
}