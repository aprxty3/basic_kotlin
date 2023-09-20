package `1`.basic_fundamental

fun main() {

    //Conjunction atau AND (&&)
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }

    val isOpen2 = now >= officeOpen && now <= officeClosed
    val isOpen3 = now in officeOpen..officeClosed

    println("Office is open : $isOpen")
    println("Office is open : $isOpen2")
    println("Office is open : $isOpen3")

    //Disjunction atau OR (||)
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")

    //Negation atau NOT (!)
    val isOpen4 = now > officeOpen

    if (!isOpen4) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}