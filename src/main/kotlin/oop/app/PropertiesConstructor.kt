import oop.data.User

fun main() {
    val user1 = User("A", "B")
    println(user1.username)
    println(user1.password)

    user1.username = "asdads"
    println(user1.username)

    println(user1)
}