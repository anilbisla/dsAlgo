class Solution {
    public int search(int[] nums, int target) {
		return Solution.performBinarySearch(nums, 0, nums.length - 1, target);
    }

	private static int performBinarySearch(int[] nums, int start, int end, int target) {
		int mid = start + (end - start) / 2;
		if (start > end) {
			return -1;
		}
		if (nums[mid] == target) {
			return mid;
		} else if (nums[mid] > target) {
			return performBinarySearch(nums, start, mid -1, target);
		} else if (nums[mid] < target) {
			return performBinarySearch(nums, mid + 1, end, target);
		}
		return -1;
	}
}