package basic.belajar.util

fun sayHello(nama: String = "") {
    val message = {
        if (nama.isEmpty()) {
            "Hello World"
        } else {
            "Hello $nama"
        }
    }
    println(message())
}

fun sayGoodBye(nama: String = "") {
    val message = {
        if (nama.isEmpty()) {
            "Good Bye World"
        } else {
            "Good Bye $nama"
        }
    }
    println(message())
}