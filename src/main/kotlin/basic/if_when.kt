fun main() {
    fun sayaHello(nama: String = "") {
        return if (nama.isEmpty()) {
            println("Hello World")
        } else {
            println("Hello $nama")
        }
    }

    sayaHello()
    sayaHello("Kotlin")

    fun sayHello(nama: String = "") {
        return when (nama) {
            "" -> println("Hello World")
            else -> println("Hello $nama")
        }
    }

    sayHello()
    sayHello("Kotlin")
}
