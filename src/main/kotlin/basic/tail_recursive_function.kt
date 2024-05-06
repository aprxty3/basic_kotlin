fun main() {
    tailrec fun recursiveFunction(i: Int) {
        println("Perulangan ke-$i")
        if (i > 0) {
            recursiveFunction(i - 1)
        }
    }

    recursiveFunction(1000)

    // factorial with tail recursive
    tailrec fun factorial(n: Int, result: Int = 1): Int {
        return if (n == 1) {
            result
        } else {
            factorial(n - 1, n * result)
        }
    }

    println(factorial(5))
}