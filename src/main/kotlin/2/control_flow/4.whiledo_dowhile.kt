fun main() {
    var counter = 1
    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)

    var value = 'A'
    do {
        print(value)
        value++
    } while (value <= 'Z')
}