fun labelBreak() {
    LoopI@ for (i in 1..10) {
        LoopJ@ for (j in 1..10) {
            println("Perulangan ke-$i $j")
            if (j == 5) {
                break@LoopI
            }
        }
        println("Perulangan ke-$i")
    }
}

//labelContinue
fun labelContinue() {
    LoopI@ for (i in 1..10) {
        LoopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@LoopI
            }
            println("Perulangan ke-$i $j")
        }
    }
}

fun main() {
    labelContinue()

}