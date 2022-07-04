class Solution {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum(), leftSum = 0;
        for (int i =0; i< nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}