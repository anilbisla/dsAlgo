class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int cursor = m + n - 1;

		while (p2 >= 0) {
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[cursor] = nums1[p1];
				p1--;
			} else {
				nums1[cursor] = nums2[p2];
				p2--;
			}
			cursor--;
		}
		//Arrays.stream(nums1).forEach(i -> System.out.print(i + " "));
	}
}