fun main() {
    inlineFunction {
        println("Hello World")
    }
}

inline fun inlineFunction(block: () -> Unit) {
    println("Before")
    block()
    println("After")
}
