fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)

    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }

    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")


    val color1: Color = Color.GREEN

    when (color1) {
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


//Anonymous Class
enum class Colors(val color: Int) {
    Red(0xFF0000) {
        override fun printValue() {
            println("Value of Red is $color")
        }
    },
    Green(0x00FF00) {
        override fun printValue() {
            println("Value of Green is $color")
        }
    },
    Blue(0x0000FF) {
        override fun printValue() {
            println("Value of Blue is $color")
        }
    }, ;

    abstract fun printValue()
}