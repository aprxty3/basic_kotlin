package oop.app

open class Teacher(val name: String) {
    private fun student(name: String) {
        println("Student $name")
    }

    fun print() {
        student("Budi")
    }
}

class SuperTeacher(name: String) : Teacher(name) {
    fun test() {
        // student("Budi") // Error
        print()
    }
}

fun main() {
    val teacher = Teacher("Aji")
    // teacher.student("Budi") // Error
    teacher.print()

    val superTeacher = SuperTeacher("Budi")
    superTeacher.test()
}
