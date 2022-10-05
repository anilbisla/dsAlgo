class Solution {
    public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> valuesIndex = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			int required = target - curr;
			if (valuesIndex.containsKey(required)) {
				return new int[] { valuesIndex.get(required), i};
			}
			valuesIndex.put(curr, i);
		}
		return null;
	}
}