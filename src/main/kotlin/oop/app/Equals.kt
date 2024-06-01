package oop.app

class Company(val name: String){
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> name == other.name
            else -> false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

class Name(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Name -> name == other.name
            else -> false
        }

    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun main() {
    val name1 = Company("Kotlin")
    val name2 = Company("Kotlin")

    println(name1 == name2)

    val name3 = Name("Kotlin")
    val name4 = Name("Kotlin")

    println(name3 == name4)

    println(name1.hashCode())
    println(name2.hashCode())
    println(name1.hashCode() == name2.hashCode())
}