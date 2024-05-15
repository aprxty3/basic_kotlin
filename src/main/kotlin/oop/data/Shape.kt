package oop.data

open class Shape {
    open val corner: Int = 1
}

class Rectangel : Shape() {
    override val corner: Int = 4
}