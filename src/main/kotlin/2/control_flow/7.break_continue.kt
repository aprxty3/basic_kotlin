fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, 6, 7, null)
    for (i in listOfInt) {
        if (i == null) break

        print(i)
        println()
    }

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
        println()
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")
        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}