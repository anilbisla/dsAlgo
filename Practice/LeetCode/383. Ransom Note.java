class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        /*
		HashMap<Character, Integer> ranMap = new HashMap<>();
		for (int i = 0; i < ransomNote.length(); i++) {
			ranMap.put(ransomNote.charAt(i), ranMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
		}

		HashMap<Character, Integer> magMap = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			magMap.put(magazine.charAt(i), magMap.getOrDefault(magazine.charAt(i), 0) + 1);
		}
		
		for (Map.Entry<Character, Integer> ran: ranMap.entrySet()) {
			if (magMap.getOrDefault(ran.getKey(), 0) < ran.getValue()) {
				return false;
			}
		}
		
		return true;
        */
        
        if (ransomNote.length() > magazine.length()) {
			return false;
		}
		int[] alphabets_counter = new int[26];

		for (char c : magazine.toCharArray()) {
			alphabets_counter[c - 'a']++;
		}

		for (char c : ransomNote.toCharArray()) {
			if (alphabets_counter[c - 'a'] == 0) {
				return false;
			}
			alphabets_counter[c - 'a']--;
		}
		return true;
	}
}