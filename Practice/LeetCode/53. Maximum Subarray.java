class Solution {
    public int maxSubArray(int[] nums) {
		int sum = nums[0], maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum = Integer.max(sum + nums[i], nums[i]);
			maxSum = Integer.max(maxSum, sum);
		}
		return maxSum;
	}
}