import kotlin.text.Regex

class Solution {
    fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
        if (input != null && input.isNotEmpty()) {
            return arrayOf(input.count { it > 0 }, input.filter { it < 0 }.sum())
        }
        return arrayOf()
    }

    fun digitize(n:Long):IntArray {
        return n.toString().reversed().map { it -> it.digitToInt() }.toIntArray()
    }

    fun calculateYears(years: Int): Array<Int> {
        var catYears = 0
        var dogYears = 0
        var yearsLeft = years
        while (yearsLeft > 0) {
            when (yearsLeft) {
                1 -> {
                    catYears += 15
                    dogYears += 15
                }
                2 -> {
                    catYears += 9
                    dogYears += 9
                }
                else -> {
                    catYears += 4
                    dogYears += 5
                }
            }
            yearsLeft -= 1
        }
        return arrayOf(years, catYears, dogYears);
    }

    fun areaOrPerimeter(l:Int, w:Int):Int {
        return if (l == w) l * w else 2 * l + 2 * w
    }

    fun highAndLow(numbers: String): String {
        val numList = numbers.split(" ").map {it -> it.toInt()}
        return "${numList.maxOrNull() ?: 0} ${numList.minOrNull() ?: 0}"
    }

    //https://www.codewars.com/kata/5b180e9fedaa564a7000009a

}



class Solution_1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Find two values where the indices add up to target.
        for (idx in nums.indices) {
            for (jdx in idx + 1 until nums.size) {
                if (nums[idx] + nums[jdx] == target) {
                    return intArrayOf(idx, jdx)
                }
            }
        }
        return intArrayOf(-1)
    }

    fun isPalindrome(x: Int): Boolean {
        val xAsString = x.toString()
        return xAsString == xAsString.reversed()
    }

    fun strStr(haystack: String, needle: String): Int {
        // Find index of first occurrence of needle in haystack.
        val needleLen = needle.length
        for (idx in 0 until haystack.length - needleLen + 1) {
            // CONSIDER SUBSTRING HERE.
            if (haystack.slice(idx until (idx + needleLen)) == needle) {
                return idx
            }
        }
        return -1
    }

    fun longestCommonPrefix(strs: Array<String>): String {
        // Find the longest common prefix in an array of words.
        val words = strs.toList().sortedBy { it.length }

        // Initialize common prefix length as the length of the shortest word.
        var commonPrefix = words[0]

        while (commonPrefix.isNotEmpty()) {
            if (words.all { it.startsWith(commonPrefix, 0) }) {
                break
            } else {
                commonPrefix = commonPrefix.dropLast(1)
            }
        }
        return commonPrefix
    }

    fun lengthOfLastWord(s: String): Int {
        // Get length of the last word in a sentence.
        return s.split(' ').last { it.isNotBlank() }.length
    }

    fun hammingWeight(n: Int): Int {
        return Integer.toBinaryString(n).count { it == '1' }
    }

    fun twoOldestAges(ages: List<Int>): List<Int> {
        var maxNumber: Int = -100
        var secondMaxNumber: Int = -100

        for (age in ages) {
            if (age > maxNumber) {
                secondMaxNumber = maxNumber
                maxNumber = age
            } else if (age > secondMaxNumber) {
                secondMaxNumber = age
            }
        }
        return listOf(secondMaxNumber, maxNumber)
    }

    fun nbDig(n: Int, d: Int): Int {
        val squares: String = (0..n).joinToString { (it * it).toString() }
        var acc = 0
        for (digit in squares.asIterable()) {
            if (digit.toString() == d.toString()) {
                acc += 1
            }
        }
        return acc
    }

    fun meeting(s: String): String {
        return s.uppercase().split(";").map { it.split(":") }.sortedWith(compareBy { "${it[1]} ${it[0]}" })
            .joinToString(separator = "") { "(${it[1]}, ${it[0]})" }
    }

    fun count1(number: Int): Int {
        if (number % 10 != 0) { return -1 }
        val values: List<Int> = listOf(500, 200, 100, 50, 20, 10)

        var acc: Int = 0
        var n: Int = number
        for (value in values) {
            acc += Math.floorDiv(n, value)
            n %= value
        }
        return acc
    }

    fun printerError(s: String): String {
        val badLetters = "nopqrstuvwxyz".toCharArray()
        val totalBad = s.filter { badLetters.contains(it) }.length
        return "${totalBad}/${s.length}"
    }

    fun getAge(yearsOld: String): Int {
        return Regex("""(\d) years old""").find(yearsOld)?.groups?.get(1)?.value?.toInt() ?: -1
    }

    fun oddCount(n: Int): Int {
        // Wow!  Integer division!
        return Math.floorDiv(n, 2)
    }

    fun maps(x: IntArray): IntArray {
        return x.map {2 * it}.toIntArray()
    }

    fun loveFun(flowerA: Int, flowerB: Int): Boolean {
        return (flowerA + flowerB) % 2 != 0
    }

    fun sum1(numbers: IntArray): Int {
        return numbers.filter { it > 0 }.sum()
    }

}