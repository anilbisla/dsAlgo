class Solution {
    public String reverseWords(String s) {

		String[] strList = s.split(" ");
		List<String> revList = new ArrayList<>();

		for (String str : strList) {
			revList.add(Solution.reverseString(str.toCharArray()));
		}

		return String.join(" ", revList);
	}

	static public String reverseString(char[] s) {
		int start = 0;
		int end = s.length - 1;
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		return new String(s);
	}
}