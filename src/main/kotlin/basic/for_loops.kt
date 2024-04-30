fun main() {
    val names = arrayOf("John", "Doe", "Jane", "Smith")
    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("total perulangan $total")


    for (i in 1..10 step 2) {
        println("perulangan ke-$i")
    }
}