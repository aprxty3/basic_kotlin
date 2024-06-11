package oop.app

data class Game(val name: String, val price: Int)

data class MinMax(val min: Int, val max: Int)
data class Login(val username: String, val password: String)

fun minmax(value1: Int, value2: Int): MinMax {
    return if (value1 < value2) {
        MinMax(value1, value2)
    } else {
        MinMax(value2, value1)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("GTA V", 200000)
    val (name, price) = game
    println("Name: $name, Price: $price")

    val (min, max) = minmax(10, 20)
    println("Min: $min, Max: $max")

    val login = Login("admin", "admin")
    login(login) { (username, password) ->
        username == "admin" && password == "admin"

    }
    println(login(login) { (username, password) ->
        username == "admin" && password == "admin"
    })

}