import oop.data.Car

fun main(){
    var almaz = Car("Almaz")
    println(almaz.year)
    almaz.year = 2023
    println(almaz.year)

    var avanza = Car("Avanza", 2024)
    println(avanza.brand)
    avanza.brand = "Toyota"
    println(avanza.brand)
}