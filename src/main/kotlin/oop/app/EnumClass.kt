package oop.app

enum class Gender(val description: String) {
    Male("Man"), Female("Woman");

    fun showDescription() {
        println(description)
    }
}


fun main() {
    val man = Gender.Male
    val woman = Gender.Female
    val allGender = Gender.entries.toTypedArray()

    println(man)
    println(woman)
    println(allGender.joinToString())

    man.showDescription()
    woman.showDescription()
}
