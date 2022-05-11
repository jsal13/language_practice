fun getMiddle(word: String): String {
    return if (word.length % 2 == 0) {
        word.slice(((word.length / 2) - 1)..((word.length / 2)))
    } else {
        word[(word.length - 1) / 2].toString()
    }
}

fun getMiddleSubstring(word: String): String {
    return if (word.length % 2 == 0) {
        word.substring(((word.length / 2) - 1)..((word.length / 2)))
    } else {
        word.substring((word.length - 1) / 2, ((word.length - 1) / 2) + 1)
    }
}

fun main() {
    println(getMiddle("arithmetic"))
    println(getMiddleSubstring("arithmetic"))
}