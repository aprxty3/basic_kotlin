package oop.app

class Boss(val bossName: String) {
    inner class Employee(val name: String) {
        fun sayHello() {
            println("Hello, my name is $name, and my boss are $bossName")
        }
    }


}

fun main() {
val boss = Boss("Aji")
    val employee = boss.Employee("Budi")
    employee.sayHello()
}