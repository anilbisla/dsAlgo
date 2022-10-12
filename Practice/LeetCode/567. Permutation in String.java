class Solution {
    public boolean checkInclusion(String s1, String s2) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 > l2) {
			return false;
		}

		int[] s1Char = new int[26];
		int[] s2Char = new int[26];

		// Taking the first chunk from s2 of the size of s1
		for (int i = 0; i < l1; i++) {
			s1Char[s1.charAt(i) - 'a']++;
			s2Char[s2.charAt(i) - 'a']++;
		}

		if (Solution.checkArrayEquality(s1Char, s2Char)) {
			return true;
		}

		// Now pick next element from s2 and remove first element from s2
		for (int i = l1; i < l2; i++) {
			s2Char[s2.charAt(i) - 'a']++;
			s2Char[s2.charAt(i - l1) - 'a']--;
			if (Solution.checkArrayEquality(s1Char, s2Char)) {
				return true;
			}
		}

		return false;
	}

	private static boolean checkArrayEquality(int[] s1Char, int[] s2Char) {
		return Arrays.equals(s1Char, s2Char);
	}
}