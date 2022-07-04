class Solution {
    fun pivotIndex(nums: IntArray): Int {
       var rightSum = nums.sum()
        var leftSum = 0
        var res = -1
        nums.forEachIndexed { index, value ->
            rightSum -= value
            if(rightSum == leftSum) {
                res = index
                return res
            }
            leftSum += value
        }
        return res 
    }
}