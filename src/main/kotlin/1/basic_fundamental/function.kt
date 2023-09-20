package `1`.basic_fundamental

fun main() {
    val user = setUser("Ajii", 20)
    println(user)

    printUser("Ajii")
}

fun setUser(name: String, age: Int) = "Your name is $name, and your age $age"
fun printUser(name: String) =
    println("Your name is $name")
