package oop.app

fun main() {
    val students = Students("Aji", 20)
    students.let {
        println(it.name)
        println(it.age)
    }

    students.run {
        println(name)
        println(age)
    }

    val result = students.also {
        "Hello ${it.name} ${it.age}"
    }
    println(result)

    val result2 = with(students) {
        "Hello ${name} ${age}"
    }
    println(result2)
}
