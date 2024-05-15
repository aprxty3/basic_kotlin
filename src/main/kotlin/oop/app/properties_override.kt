package oop.app

import oop.data.Rectangel
import oop.data.Shape

fun main(){
    val shape = Shape()

    println(shape.corner)

    val shape2 = Rectangel()
    println(shape2.corner)
    println(shape2.superParent)
}