class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        Solution.reverse(nums, 0, nums.length - k - 1);
        Solution.reverse(nums, nums.length - k, nums.length - 1);
        Solution.reverse(nums, 0, nums.length -1);
    }
	
	public static void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}
}