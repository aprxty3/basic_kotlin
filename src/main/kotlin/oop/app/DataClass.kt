package oop.app

class Product(val name: String, val price: Int, val type: String)

data class Produk(val name: String, val price: Int, val type: String)

fun main() {
    val product = Product("Laptop", 15000000, "Electronic")
    println(product)

    val produk = Produk("Laptop", 15000000, "Electronic")
    val produk2 = produk.copy(name = "Smartphone")
    println(produk)
    println(produk2)
}