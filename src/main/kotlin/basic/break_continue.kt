fun main() {
    var i = 0
    while (i < 10) {
        println("Perulangan ke-$i")
        i++
        if (i == 5) {
            break
        }
    }

    //with continue
    var j = 0
    while (j < 10) {
        j++
        if (j % 2 == 0) {
            continue
        }
        println("Perulangan ke-$j")
    }
}