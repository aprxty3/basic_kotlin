fun main() {
    var age: Byte = 30
    var height: Short = 170
    var distance: Int = 1000
    var weight: Long = 1000000000000000000

    println("Age is $age")
    println("Height is $height")
    println("Distance is $distance")
    println("Weight is $weight")

    var pi: Float = 3.14f
    var e: Double = 2.7182818284590452353602874713527

    println("Pi is $pi")
    println("Euler's number is $e")

    var binary: Int = 0b1001
    var price: Long = 9_000_000_000L

    println("Binary is $binary")
    println("Price is $price")


    var number: Int = 100

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println("Byte is $byte :: Short is $short :: Long is $long :: Float is $float :: Double is $double")
}