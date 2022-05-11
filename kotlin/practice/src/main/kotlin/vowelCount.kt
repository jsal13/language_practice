fun getCount(word: String): Int {
    // Counts number of vowels in `str`.
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    return word.toCharArray().filter { vowels.contains(it) }.size
}

fun main() {
    println(getCount("arithmetic"))
}