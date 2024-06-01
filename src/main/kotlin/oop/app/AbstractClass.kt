import oop.data.Cat
import oop.data.Dog

fun main(){
    val city = City("Jakarta")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)

    val cat  = Cat()
    cat.run()

    val doh = Dog()
    doh.run()
}