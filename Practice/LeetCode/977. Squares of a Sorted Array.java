public class Solution {
	
	/*public static void main(String[] args) {
		int[] ans = sortedSquares(new int[] {-7,-5,-1,0,3,5,9,12});
		Arrays.stream(ans).forEach(i -> System.out.print(i + " "));
	}
	
	static*/ public int[] sortedSquares(int[] nums) {
		int[] square = new int[nums.length];
		int start = 0;
		int end = nums.length - 1;
		int currIndex = nums.length - 1;
		
		while (start <= end) {
			if (Math.abs(nums[start]) > Math.abs(nums[end])) {
				square[currIndex] = nums[start] * nums[start];
				start++;
			} else {
				square[currIndex] = nums[end] * nums[end];
				end--;
			}
			currIndex--;
		}
		return square;
    }
}
