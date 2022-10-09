class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> m1 = new HashMap<>();
		// put all nums1 values into map
		for (int i = 0; i < nums1.length; i++) {
			int val = 0;
			if (m1.containsKey(nums1[i])) {
				val = m1.get(nums1[i]);
			}
			m1.put(nums1[i], val + 1);
		}

		List<Integer> intersection = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			int val = 0;
			if (m1.containsKey(nums2[i])) {
				val = m1.get(nums2[i]);
				intersection.add(nums2[i]);
				val--;
				if (val > 0) {
					m1.put(nums2[i], val);
				} else {
					m1.remove(nums2[i]);
				}
			}
		}

		int[] intersect = new int[intersection.size()];
		// Works with non primitive data types
		//intersect = intersection.toArray(new int[0]);
		for (int i = 0; i < intersection.size(); i++) {
			intersect[i] = intersection.get(i);
		}
		return intersect;
	}
}