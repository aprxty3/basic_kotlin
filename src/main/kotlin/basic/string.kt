fun main() {
    val name: String = "John Doe"
    val address: String = """
        |123 Main Street
        |Somewhere, USA
    """.trimMargin()

    var address2: String = """
        >123 Main Street
        >Somewhere, USA
    """.trimMargin(marginPrefix = ">")

    println("Name is $name")
    println("Address is $address")
    println("Address 2 is $address2")

    var firstName: String = "John"
    var lastName: String = "Doe"
    var fullName: String = "$firstName $lastName"
    var fullName2: String = firstName + " " + lastName

    println("Full Name is $fullName :: Full Name 2 is $fullName2")
    println("Full Name Length is ${fullName.length}")
}