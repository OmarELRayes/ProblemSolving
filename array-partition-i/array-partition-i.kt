class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var res = 0
        for(i in nums.indices step 2) res += nums[i]
        return res
    }
}