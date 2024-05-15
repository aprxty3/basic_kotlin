package oop.app

import oop.data.Customer
import oop.data.ExecutiveCustomer
import oop.data.PremiumCustomer

fun main() {
    val customer = Customer("Kotlin")
    println(customer.name)
    println(customer.type)
    println(customer.balance)

    val premiumCustomer = PremiumCustomer("Kotlin")
    println(premiumCustomer.name)
    println(premiumCustomer.type)
    println(premiumCustomer.balance)

    val executiveCustomer = ExecutiveCustomer("Kotlin", 1000)
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}