package `1`.basic_fundamental

fun main() {


    // ketika menggunakan type data var maka bisa diubah
    var name: String = "Ajii"
    name = "Saputra"
    println(name)


    val firstName = "Ajii"
    val lastName = "Saputra"

    println(firstName + lastName)

    // ketika menggunakan type data val maka tidak bisa diubah
//    firstName = "Saputra"
//    print(firstName + lastName)

    // ketika data Int + Int maka hasilnya akan bertambah output valuenya, sedangkan ketika data String + String maka hasilnya akan digabungkan
    val valueA = 10
    val valueB: Int = 20
    println(valueA + valueB)

    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)


    //Escape String
    println("I'm Ajii \"Saputra\"")


    //Raw String
    println("haayy \n akuu \n ajii")

    println("""
        >Halo
        >Saya
        >Ajii
        >Saputra
    """.trimIndent())

}

