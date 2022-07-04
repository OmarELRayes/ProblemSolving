class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var maxValue = -1
        var maxIndex = -1
        nums.forEachIndexed { index, value ->
            if (value > maxValue) {
                maxValue = value
                maxIndex = index
            }
        }
        nums.forEach {
            if (it != maxValue && maxValue < it * 2)
                return -1
        }
        return maxIndex
    }
}