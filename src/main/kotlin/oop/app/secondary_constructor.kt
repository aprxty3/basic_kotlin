import oop.data.Address

fun main(){
    var rumah = Address("Jalan A", "Jakarta")
    println(rumah.street)
    println(rumah.city)

    var rumah1 = Address("Jalan B", "Jakarta", "Indonesia")
    println(rumah1.street)
    println(rumah1.city)
    println(rumah1.country)

}