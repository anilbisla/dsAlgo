class Solution {
    public int[] twoSum(int[] nums, int target) {
		/*
		Map<Integer, Integer> valuesIndex = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			int required = target - curr;
			if (valuesIndex.containsKey(required)) {
				return new int[] { valuesIndex.get(required) + 1, i + 1};
			}
			valuesIndex.put(curr, i);
		}
		return null;
		*/
		int left = 0;
		int right = nums.length - 1;

		while (nums[left] + nums[right] != target) {
			if (nums[left] + nums[right] > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] { left + 1, right + 1 };
	}
}