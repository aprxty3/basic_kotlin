fun main(){
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

    sayHello()
    sayHello("Kotlin")
}