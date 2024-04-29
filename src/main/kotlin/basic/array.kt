fun main() {
    val member = arrayOf("John", "Doe", "30")
    val values = arrayOf(10, 20, 30)
    val balance = arrayOf(10.0, 20.0, 30.0)

    println("Member: ${member[0]} ${member[1]} ${member[2]} :: ${member.size} :: $member")
    println("Values: ${values[0]} ${values[1]} ${values[2]} :: ${values.size} :: $values")
    println("Balance: ${balance[0]} ${balance[1]} ${balance[2]} :: ${balance.size} :: $balance")

    member[0] = "Jane"

    println("Member: ${member[0]} ${member[1]} ${member[2]} :: ${member.size} :: $member")

    val members: Array<String?> = arrayOfNulls(3)
    members[0] = "John"
    members[1] = "Doe"
    members[2] = "30"
    println(members.size)
}