class Solution {
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

    fun count(number: Int): Int {
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

}