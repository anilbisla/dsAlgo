class Solution {
    public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] alphabets_counter = new int[26];

		for (char c : t.toCharArray()) {
			alphabets_counter[c - 'a']++;
		}

		for (char c : s.toCharArray()) {
			alphabets_counter[c - 'a']--;
		}
		
		for (int i : alphabets_counter) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}
}