package oop.data

open class Shape {
    open val corner: Int = 1

    open fun printName() {
        println("This is shape")
    }
}

class Rectangel : Shape() {
    override val corner: Int = 4
    val superParent: Int = super.corner

    override fun printName() {
        println("This is Rectangel")
        super.printName()
    }
}