import kotlin.math.abs

fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
    // https://www.codewars.com/kata/5663f5305102699bad000056/train/kotlin
    if (a1.isEmpty() || a2.isEmpty()) {
        return -1
    }

    val a1max: Int = a1.maxOfOrNull { it.length } ?: 0
    val a1min: Int = a1.minOfOrNull { it.length } ?: 0
    val a2max: Int = a2.maxOfOrNull { it.length } ?: 0
    val a2min: Int = a2.minOfOrNull { it.length } ?: 0

    return maxOf(abs(a1max - a2min), abs(a1min - a2max))
}

fun main() {
    val a1 = arrayOf<String>(
        "hoqq",
        "bbllkw",
        "oox",
        "ejjuyyy",
        "plmiis",
        "xxxzgpsssa",
        "xxwwkktt",
        "znnnnfqknaz",
        "qqquuhii",
        "dvvvwz"
    )
    val a2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")

    println(mxdiflg(a1, a2))
}
