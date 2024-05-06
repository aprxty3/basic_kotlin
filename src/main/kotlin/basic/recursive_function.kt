fun main() {
    fun recursiveFunction(i: Int = 0) {
        if (i == 10) {
            return
        }
        println("Perulangan ke-$i")
        recursiveFunction(i + 1)
    }

    recursiveFunction()
}