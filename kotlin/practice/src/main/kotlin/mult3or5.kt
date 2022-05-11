fun solution(number: Int): Int {
    // Returns sum of multiples of 3 and 5.
    if (number < 0) {
        return 0
    }
    var acc = 0
    for (i in 1 until number) {
        if (i % 3 == 0 || i % 5 == 0) {
            acc += i
        }
    }
    return acc
}

fun solutionFunctional(number: Int): Int {
    // Functional version of solution.
    println("Wow, functional!")
    return (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}

fun main() {
    println(solution(1000))
    println(solutionFunctional(1000))
}