class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var res = 0
        var i = 0
        var j = 0
        while (j < nums.size) {
            if (nums[i] == 1 && nums[j] == 1) {
                j++
                res = Math.max(res, j - i)
            } else if(nums[j] == 0){
                i = j+1
                j++
            }
        }
        return res
    }
}