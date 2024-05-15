package oop.data

class Car(paramBrand: String, paramYear: Int = 2022) {

    var brand: String = paramBrand
    var year: Int = paramYear

    init {
        println("Car $brand dibuat")
    }
}