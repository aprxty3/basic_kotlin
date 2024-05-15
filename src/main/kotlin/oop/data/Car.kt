package oop.data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 0) {
        println("Secondary Constructor")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Third Constructor")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear

    init {
        println("Car $brand dibuat")
    }
}