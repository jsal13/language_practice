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
            if (haystack.slice(idx until (idx+needleLen)) == needle) {
                return idx
            }
        }
        return -1
    }
    fun longestCommonPrefix(strs: Array<String>): String {
        // Find the longest common prefix in an array of words.
        val words = strs.toList().sortedBy {it.length}

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

    fun hammingWeight(n:Int):Int {
        return Integer.toBinaryString(n).count{it == '1'}
    }

}