fun main() {
    val nilai = 'A'
    when (nilai) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again")
        else -> println("Not Found")
    }

    val nilai1 = 90
    when {
        nilai1 > 90 -> println("Amazing")
        nilai1 > 80 -> println("Good")
        nilai1 > 70 -> println("Not Bad")
        nilai1 > 60 -> println("Bad")
        else -> println("Try Again")
    }

    val nilai2 = 80
    when (nilai2) {
        in 90..100 -> println("Amazing")
        in 80..89 -> println("Good")
        in 70..79 -> println("Not Bad")
        in 60..69 -> println("Bad")
        else -> println("Try Again")
    }

    val nilai3 = 70
    when (nilai3) {
        !in 90..100 -> println("Amazing")
        !in 80..89 -> println("Good")
        !in 70..79 -> println("Not Bad")
        !in 60..69 -> println("Bad")
        else -> println("Try Again")
    }

    val member = arrayOf("John", "Doe", "30")
    when (member[0]) {
        "John" -> println("Hello John")
        "Jane" -> println("Hello Jane")
        else -> println("Hello Guest")
    }

    when (member[0]) {
        in arrayOf("John", "Jane") -> println("Hello ${member[0]}")
        else -> println("Hello Guest")
    }

    var nilaiLulus = "A"
    val array = arrayOf("A", "B", "C")
    nilaiLulus = "R"
    when (nilaiLulus) {
        in array -> println("Lulus")
        !in array -> println("Tidak Lulus")
    }
}