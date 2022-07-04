class Solution {
    public int dominantIndex(int[] nums) {
        int maxValue = -1, maxIndex = -1, secondMax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                secondMax = maxValue;
                maxValue = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax)
                secondMax = nums[i];
        }
        return maxValue < secondMax * 2 ? -1 : maxIndex;
    }
}