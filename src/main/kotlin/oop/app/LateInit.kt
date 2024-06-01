package oop.app

fun main(){

    val television = Television("TV")
    television.setUp("Samsung")
    println(television.brand)
}

class Television(val name: String){
    lateinit var brand: String

    fun setUp(brand: String){
        this.brand = brand
    }
}