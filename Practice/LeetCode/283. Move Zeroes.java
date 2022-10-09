class Solution {
    public void moveZeroes(int[] nums) {
		int numOfZeroes = 0;
		int nonZero = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				numOfZeroes++;
			} else {
				nums[nonZero] = nums[i];
				nonZero++;
				if (numOfZeroes > 0) {
					nums[i] = 0;
				}
			}
		}
	}
}