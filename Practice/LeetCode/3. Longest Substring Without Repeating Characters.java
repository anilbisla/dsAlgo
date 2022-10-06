class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, curr = 0, ans = 0;
        Integer[] m = new Integer[128];
        while(curr < s.length()){
            char ch = s.charAt(curr);
            Integer index = m[ch];
            if(index!=null && index>=left){
                left = index+1;
            }
            ans = Math.max(ans, curr-left+1);
            m[ch]=curr;
            curr++;
        }
        return ans;
    }
/*
	static public int lengthOfLongestSubstring(String s) {


		int length = s.length();
		if (length == 0) {
			return 0;
		}
		
		char[] charArray = s.toCharArray();
		
		int maxSize = 0;
		int size = 0;
		
		int start = 0;
		int curr = 0;
		
		Set<Character> present = new HashSet<>();
		
		while (curr < length) {
			
			char curChar = charArray[curr];
			
			if (present.contains(curChar)) {
				if (charArray[start] == curChar) {
					start++;
				} else {
					size = curr - start;
					maxSize = Integer.max(size, maxSize);
					size = 1;
					//start = curr;
					start = Solution.getNewStart(charArray, start, curChar);
					present.clear();
					present.addAll(Solution.getNewPresent(charArray, start, curr));
					present.add(curChar);
				}
				
			} else {
				//size++;
				size = curr - start +1 ;
				present.add(curChar);
			}
			
			maxSize = Integer.max(size, maxSize);
			curr++;
		}
		
		return maxSize;
	}

	private static Set<Character> getNewPresent(char[] charArray, int start, int curr) {
		Set<Character> newPresent = new HashSet<>();
		for (int i = start; i <= curr; i++) {
			newPresent.add(charArray[i]);
		}
		return newPresent;
	}

	private static int getNewStart(char[] charArray, int start, char curChar) {
		
		while (true) {
			if (charArray[start+1] == curChar) {
				return start + 2;
			}
			start++;
		}
	}
*/
}