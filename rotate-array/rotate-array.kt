class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
            if (nums.size == 1) return
            val r = k % nums.size
            reverse(nums, 0, nums.size )
            reverse(nums, 0, r )
            reverse(nums, r, nums.size )
    }
    fun reverse(nums: IntArray, start: Int, end: Int) {
        val mid = ((start + end) / 2)
        var reverseIndex = end - 1
        for (index in start until mid) {
            nums[index] = nums[reverseIndex].also { nums[reverseIndex] = nums[index] }
            reverseIndex--
        }
    }
}