package `1`.basic_fundamental

fun main() {
    val text: String? = null

    if (text != null) {
        val textLength = text.length
        println(textLength)
    }


    val text1: String? = null
    val textLength1 = if (text1 != null) text1.length else 7


    val text2: String? = null
    val textLength2 = text2!!.length

}