fun main() {
    val isTrue: Boolean = true
    val isFalse: Boolean = false

    println("Is True: $isTrue")
    println("Is False: $isFalse")

    val nilaAbsen = 75
    val nilaiUjian = 80

    val isLulus = nilaiUjian > 75
    val isNilaiAbsen = nilaAbsen > 75

    println("Is Lulus: $isLulus")
    println("Is Nilai Absen: $isNilaiAbsen")

    val isLulusKriteria = isLulus && isNilaiAbsen
    println("Is Lulus Kriteria: $isLulusKriteria")

    val isLulusSalahSatuKriteria = isLulus || isNilaiAbsen
    println("Is Lulus Salah Satu Kriteria: $isLulusSalahSatuKriteria")
}