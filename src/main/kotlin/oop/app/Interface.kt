package oop.app

import oop.data.Human
import oop.data.Manusya

fun main(){
    val human = Human("Aji")
    human.sayHello("Budi")
    human.got()

    val lari = Manusya("Aji")
    lari.sayHello("Budi")
    lari.lari()
}