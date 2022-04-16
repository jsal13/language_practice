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
}